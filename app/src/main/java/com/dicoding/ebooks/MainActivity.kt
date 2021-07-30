package com.dicoding.ebooks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var rvBook : RecyclerView
    private var list: ArrayList<Book> =  arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        setSupportActionBar(findViewById(homeTb))
//        supportActionBar!!.setDisplayShowTitleEnabled(false)

        rvBook = findViewById(R.id.rvBooks)
        rvBook.setHasFixedSize(true)

        list.addAll(BooksData.listData)
        showRecyclerList()

        val imgMe:ImageView = findViewById(R.id.img_me)

        imgMe.setOnClickListener(this)

    }

    private fun showRecyclerList() {
        rvBook.layoutManager = LinearLayoutManager(this)
        val listBookAdapter = ListBookAdapter(list)
        rvBook.adapter = listBookAdapter
    }

    override fun onClick(v: View?) {
      when (v?.id){
          R.id.img_me -> {
           var move = Intent(this@MainActivity, Profile::class.java )
              startActivity(move)
          }
      }
    }
}