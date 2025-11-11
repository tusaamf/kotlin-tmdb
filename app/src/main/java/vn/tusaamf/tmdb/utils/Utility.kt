package vn.tusaamf.tmdb.utils

import android.app.Activity
import android.content.Intent
import android.os.Bundle

object Utility {
    fun Activity.launchActivity(
        packageName: String,
        clazzName: String,
        flags: Int = -1,
        bundle: Bundle? = null
    ) {
        val intent = Intent(Intent.ACTION_VIEW).setClassName(packageName, clazzName)
        if (flags != -1) {
            intent.flags = flags
        }
        if (bundle != null) {
            intent.putExtras(bundle)
        }
        startActivity(intent)
    }
}