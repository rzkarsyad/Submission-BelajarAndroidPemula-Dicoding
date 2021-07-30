package com.dicoding.ebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class BookDetails : AppCompatActivity(), View.OnClickListener {

    var isClick: Boolean = false

    companion object{
        const val EXTRA_TITLE = "extra_title"
        const val EXTRA_DESC = "extra_desc"
        const val EXTRA_WRITTER = "extra_writer"
        const val EXTRA_PAGE = "extra_page"
        const val EXTRA_CATEGORY = "extra_category"
        const val EXTRA_PUBLISHER= "extra_publisher"
        const val EXTRA_IMG= "extra_img"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)
        val btnBack : ImageButton = findViewById(R.id.backBtn)
        val btnShare : ImageButton = findViewById(R.id.btnShare)
        val btnRead : Button = findViewById(R.id.btnStartReading)
        val btnSave : ImageButton = findViewById(R.id.BtnBookMark)
        btnSave.setBackgroundResource(R.drawable.ic_save_black)
        btnBack.setOnClickListener(this)
        btnShare.setOnClickListener(this)
        btnRead.setOnClickListener(this)
        btnSave.setOnClickListener(this)

        val titleBook = findViewById<TextView>(R.id.titleDetail)
        val descBook = findViewById<TextView>(R.id.descDetail)
        val writterBook = findViewById<TextView>(R.id.writterDetail)
        val pageBook = findViewById<TextView>(R.id.pageDetail)
        val categoryBook = findViewById<TextView>(R.id.categoryDetail)
        val pubBook = findViewById<TextView>(R.id.penerbitDetail)
        val imgBook = findViewById<ImageView>(R.id.imgDetail)

        val bTitle = intent.getStringExtra(EXTRA_TITLE)
        val bDesc = intent.getStringExtra(EXTRA_DESC)
        val bWritter = intent.getStringExtra(EXTRA_WRITTER)
        val bPage = intent.getStringExtra(EXTRA_PAGE)
        val bCategory = intent.getStringExtra(EXTRA_CATEGORY)
        val bPublisher = intent.getStringExtra(EXTRA_PUBLISHER)
        val bImg = intent.getIntExtra(EXTRA_IMG, 0)

        Glide.with(this)
            .load(bImg)
            .apply(RequestOptions())
            .into(imgBook)
        titleBook.text = bTitle
        descBook.text = bDesc
        writterBook.text = "Karya $bWritter"
        pageBook.text = bPage
        categoryBook.text = bCategory
        pubBook.text = bPublisher

    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.backBtn -> {
                onBackPressed()
            }
            R.id.btnShare -> {
                setShare()
            }
            R.id.btnStartReading -> {
                Toast.makeText(applicationContext, "Mulai membaca", Toast.LENGTH_SHORT).show()
            }
            R.id.BtnBookMark -> {
                if(isClick){
                    v.setBackgroundResource(R.drawable.ic_save_black)
                Toast.makeText(applicationContext, "Berhasil dihapus dari Favorit", Toast.LENGTH_SHORT).show()
                }else{
                    v.setBackgroundResource(R.drawable.ic_save_green)
                Toast.makeText(applicationContext, "Berhasil ditambahkan ke Favorit", Toast.LENGTH_SHORT).show()
                }
                isClick = !isClick
            }
        }
    }

    private fun setShare() {
        val shareTitle = intent.getStringExtra(EXTRA_TITLE)
        val shareWritter = intent.getStringExtra(EXTRA_WRITTER)
        val move = Intent(Intent.ACTION_SEND)
        move.setType("text/plain")
        val bodyText = "Ayo baca buku " + shareTitle + " karya " + shareWritter
        move.putExtra(Intent.EXTRA_TEXT, bodyText)
        startActivity(Intent.createChooser(move, "Sharing Option"))

    }
}