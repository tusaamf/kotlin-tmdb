package vn.tusaamf.tmdb.data.model.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MovieDto(
    val title: String,
    val originalTitle: String,
    val isFavorite: Boolean,
) : Parcelable {
    companion object {
        fun int() = MovieDto(
            title = "",
            originalTitle = "",
            isFavorite = false,
        )
    }
}