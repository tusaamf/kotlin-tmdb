package vn.tusaamf.tmdb.domain.viewstate.mediadetail

import androidx.compose.runtime.Stable
import vn.tusaamf.tmdb.domain.viewstate.IViewState

@Stable
data class MediaDetailViewState(
    val isLoading: Boolean = false
) : IViewState {
}