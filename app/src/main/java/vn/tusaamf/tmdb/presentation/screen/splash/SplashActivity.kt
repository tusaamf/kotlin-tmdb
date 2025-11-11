package vn.tusaamf.tmdb.presentation.screen.splash

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import kotlinx.coroutines.launch
import vn.tusaamf.tmdb.presentation.screen.main.MainActivity
import vn.tusaamf.tmdb.utils.Utility.launchActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {

    private val viewModel by viewModels<SplashViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        splashScreen.setKeepOnScreenCondition { true }
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                viewModel.uiEvent.collect {
                    when (it) {
                        is SplashViewEvent.DirectToDashboard -> {
                            startMainActivity()
                            finish()
                        }
                    }
                }
            }
        }
    }

    private fun startMainActivity() {
        launchActivity(
            packageName = packageName,
            clazzName = MainActivity::class.java.name
        )
    }
}