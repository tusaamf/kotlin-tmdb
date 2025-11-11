package vn.tusaamf.tmdb.domain.viewstate.dashboard

import androidx.compose.runtime.Stable
import vn.tusaamf.tmdb.domain.viewstate.IViewState

@Stable
data class DashboardViewState(
    val isLoading: Boolean = false
) : IViewState {
}