package vn.tusaamf.tmdb.data.model.response

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames
import vn.tusaamf.tmdb.data.model.MovieEntity
import vn.tusaamf.tmdb.data.model.TVEntity

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class MovieListResponse(
    val page: Int,
    @JsonNames("total_pages") val totalPages: Int,
    @JsonNames("total_results") val totalResults: Int,
    val results: List<MovieEntity>
)

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class TVListResponse(
    val page: Int,
    @JsonNames("total_pages") val totalPages: Int,
    @JsonNames("total_results") val totalResults: Int,
    val results: List<TVEntity>
)