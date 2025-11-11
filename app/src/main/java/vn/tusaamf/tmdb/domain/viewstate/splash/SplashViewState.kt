package vn.tusaamf.tmdb.domain.viewstate.splash

import androidx.compose.runtime.Stable
import vn.tusaamf.tmdb.domain.viewstate.IViewState

@Stable
data class SplashViewState(
    val isLoading: Boolean = false,
) : IViewState