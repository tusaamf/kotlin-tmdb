package vn.tusaamf.tmdb.data.model

import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@Serializable
@OptIn(ExperimentalSerializationApi::class)
data class PeopleEntity(
    val id: Int, // id
    val name: String, // name
    @JsonNames("place_of_birth") val placeOfBirth: String = "", // place_of_birth
    @JsonNames("profile_path") val profilePath: String = "", // profile_path
    val gender: Int, // gender
    val birthday: String, // birthday
    val biography: String, // biography
    val popularity: Double // popularity
)