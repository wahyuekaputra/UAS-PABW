package com.paymond.tokobaju.room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Note(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val title: String,
    val pengarang: String,
    val tahun: String,
    val penerbit: String,
    val note: String
) {
}