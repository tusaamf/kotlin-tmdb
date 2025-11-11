package vn.tusaamf.tmdb.presentation.screen.dashboard

import vn.tusaamf.tmdb.domain.viewstate.IViewEvent
import vn.tusaamf.tmdb.domain.viewstate.dashboard.DashboardViewState
import vn.tusaamf.tmdb.presentation.base.BaseViewModel
import javax.inject.Inject

class DashboardViewModel @Inject constructor() :
    BaseViewModel<DashboardViewState, DashboardViewEvent>() {

    init {

    }

    override fun createInitialState(): DashboardViewState = DashboardViewState()
}

sealed class DashboardViewEvent : IViewEvent {

}