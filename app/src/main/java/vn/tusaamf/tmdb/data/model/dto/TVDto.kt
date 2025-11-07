package vn.tusaamf.tmdb.data.model.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TVDto(
    val name: String,
    val originalName: String,
    val isFavorite: Boolean,
) : Parcelable {
    companion object {
        fun int() = TVDto(
            name = "",
            originalName = "",
            isFavorite = false,
        )
    }
}