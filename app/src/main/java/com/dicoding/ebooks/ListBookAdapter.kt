package com.dicoding.ebooks

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListBookAdapter(private val listBook: ArrayList<Book>) : RecyclerView.Adapter<ListBookAdapter.ListViewHolder>() {
    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvTitle: TextView = itemView.findViewById(R.id.tv_item_title)
        var tvWritter: TextView = itemView.findViewById(R.id.tv_item_writter)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row_book, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val book = listBook[position]
        Glide.with(holder.itemView.context)
            .load(book.image)
            .apply(RequestOptions())
            .into(holder.imgPhoto)
        holder.tvTitle.text = book.title
        holder.tvWritter.text = book.writter

        val mContext = holder.itemView.context

        holder.itemView.setOnClickListener {
            val moveDetail = Intent(mContext, BookDetails::class.java)
            moveDetail.putExtra(BookDetails.EXTRA_TITLE, book.title)
            moveDetail.putExtra(BookDetails.EXTRA_DESC, book.description)
            moveDetail.putExtra(BookDetails.EXTRA_WRITTER, book.writter)
            moveDetail.putExtra(BookDetails.EXTRA_PAGE, book.pages)
            moveDetail.putExtra(BookDetails.EXTRA_CATEGORY, book.category)
            moveDetail.putExtra(BookDetails.EXTRA_PUBLISHER, book.publisher)
            moveDetail.putExtra(BookDetails.EXTRA_IMG, book.image)
            mContext.startActivity(moveDetail)

        }
    }

    override fun getItemCount(): Int {
        return listBook.size
    }
}