package vn.tusaamf.tmdb.data.model.dto.extension

import vn.tusaamf.tmdb.data.model.*
import vn.tusaamf.tmdb.data.model.dto.*

fun MovieEntity.toMovieDto() = MovieDto(
    title = title,
    originalTitle = originalTitle,
    isFavorite = false
)

fun List<MovieEntity>.toMovieDtoList() = map { it.toMovieDto() }

fun TVEntity.toTVDto() = TVDto(
    name = name,
    originalName = originalName,
    isFavorite = false
)

fun List<TVEntity>.toTVDtoList() = map { it.toTVDto() }