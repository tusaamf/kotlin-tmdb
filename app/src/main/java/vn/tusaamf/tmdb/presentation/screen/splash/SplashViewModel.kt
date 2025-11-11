package vn.tusaamf.tmdb.presentation.screen.splash

import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import vn.tusaamf.tmdb.domain.viewstate.IViewEvent
import vn.tusaamf.tmdb.domain.viewstate.splash.SplashViewState
import vn.tusaamf.tmdb.presentation.base.BaseViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel<SplashViewState, SplashViewEvent>() {
    init {
        viewModelScope.launch {
            delay(2000)
            setEvent(SplashViewEvent.DirectToDashboard)
        }
    }

    override fun createInitialState(): SplashViewState = SplashViewState()
}

sealed class SplashViewEvent : IViewEvent {
    object DirectToDashboard : SplashViewEvent()
}