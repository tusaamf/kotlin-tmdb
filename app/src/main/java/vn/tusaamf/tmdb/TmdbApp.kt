package vn.tusaamf.tmdb

import android.app.Application
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import dagger.hilt.android.HiltAndroidApp

@Stable
@HiltAndroidApp
class TmdbApp : Application() {
    val isDark = mutableStateOf(false)
    fun toggleTheme() {
        isDark.value = !isDark.value
    }
}