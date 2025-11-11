package vn.tusaamf.tmdb.presentation.screen.mediadetail

import vn.tusaamf.tmdb.domain.viewstate.IViewEvent
import vn.tusaamf.tmdb.domain.viewstate.mediadetail.MediaDetailViewState
import vn.tusaamf.tmdb.presentation.base.BaseViewModel
import javax.inject.Inject

class MediaDetailViewModel @Inject constructor() :
    BaseViewModel<MediaDetailViewState, MediaDetailViewEvent>() {

    init {

    }

    override fun createInitialState(): MediaDetailViewState = MediaDetailViewState()
}

sealed class MediaDetailViewEvent : IViewEvent {

}