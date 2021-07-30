package com.dicoding.ebooks

import android.os.Parcelable

data class Book(
    var title: String = "",
    var description: String = "",
    var writter: String = "",
    var pages:String = "",
    var category: String = "",
    var publisher: String = "",
    var image: Int = 0
)