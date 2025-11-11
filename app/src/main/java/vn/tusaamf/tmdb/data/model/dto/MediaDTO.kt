package vn.tusaamf.tmdb.data.model.dto

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
sealed class MediaDTO(
    open val id: Int = -1,
    open val overview: String = "",
    open val backdropPath: String = "",
    open val posterPath: String = "",
    open val popularity: Int = 0,
    open val voteAverage: Int = 0,
    open val voteCount: Int = 0
) : Parcelable

@Parcelize
data class MovieDTO(
    override val id: Int = -1,
    override val overview: String = "",
    override val backdropPath: String = "",
    override val posterPath: String = "",
    override val popularity: Int = 0,
    override val voteAverage: Int = 0,
    override val voteCount: Int = 0,
    val title: String,
    val originalTitle: String,
    val isFavorite: Boolean,
) : MediaDTO(
    id = id,
    overview = overview,
    backdropPath = backdropPath,
    posterPath = posterPath,
    popularity = popularity,
    voteAverage = voteAverage,
    voteCount = voteCount
) {
    companion object {
        fun init() = MovieDTO(
            title = "",
            originalTitle = "",
            isFavorite = false,
        )
    }
}

@Parcelize
data class TvDTO(
    override val id: Int = -1,
    override val overview: String = "",
    override val backdropPath: String = "",
    override val posterPath: String = "",
    override val popularity: Int = 0,
    override val voteAverage: Int = 0,
    override val voteCount: Int = 0,
    val name: String,
    val originalName: String,
    val isFavorite: Boolean,
) : MediaDTO(
    id = id,
    overview = overview,
    backdropPath = backdropPath,
    posterPath = posterPath,
    popularity = popularity,
    voteAverage = voteAverage,
    voteCount = voteCount
) {
    companion object {
        fun init() = TvDTO(
            name = "",
            originalName = "",
            isFavorite = false,
        )
    }
}