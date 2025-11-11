package vn.tusaamf.tmdb.presentation.screen.mediadetail.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import kotlinx.serialization.Serializable
import vn.tusaamf.tmdb.common.Route
import vn.tusaamf.tmdb.data.model.dto.MediaDTO
import vn.tusaamf.tmdb.presentation.screen.mediadetail.MediaDetailScreen

@Serializable
data class MediaDetail(val mediaDetail: MediaDTO) : Route()

fun NavController.navigateMediaDetail(
    mediaDetail: MediaDTO,
    navOptions: NavOptions? = null
) {
    this.navigate(MediaDetail(mediaDetail), navOptions)
}

fun NavGraphBuilder.mediaDetailScreen(navigateToBack: () -> Unit) {
    composable<MediaDetail>(
        content = {
            MediaDetailScreen(
                navigateToBack = navigateToBack
            )
        }
    )
}