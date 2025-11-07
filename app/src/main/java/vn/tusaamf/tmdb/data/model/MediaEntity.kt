package vn.tusaamf.tmdb.data.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
@OptIn(ExperimentalSerializationApi::class)
sealed class MediaEntity(
    val id: Int = -1, // id
    val overview: String = "", // overview
    @JsonNames("backdrop_path") val backdropPath: String = "", // backdrop_path
    @JsonNames("poster_path") val posterPath: String = "", // poster_path
    val popularity: Int = 0, // popularity
    @JsonNames("vote_average") val voteAverage: Int = 0, // vote_average
    @JsonNames("vote_count") val voteCount: Int = 0// vote_count
)

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class MovieEntity(
    val title: String, // title
    @JsonNames("original_title") val originalTitle: String, // original_title
) : MediaEntity()

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class TVEntity(
    val name: String, // title
    @JsonNames("original_nam") val originalName: String, // original_name
) : MediaEntity()