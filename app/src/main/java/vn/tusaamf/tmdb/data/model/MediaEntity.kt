package vn.tusaamf.tmdb.data.model

sealed class MediaEntity(
    val id: Int = -1, // id
    val overview: String = "", // overview
    val backdropPath: String = "", // backdrop_path
    val posterPath: String = "", // poster_path
    val popularity: Int = 0, // popularity
    val voteAverage: Int = 0, // vote_average
    val voteCount: Int = 0// vote_count
)

data class MovieEntity(
    val title: String, // title
    val originalTitle: String, // original_title
) : MediaEntity()

data class TVEntity(
    val name: String, // title
    val originalName: String, // original_title
) : MediaEntity()