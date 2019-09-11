package org.pirate.sevenseas

import android.app.Application
import android.content.Context

class SevenSeasApp : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = applicationContext
    }

    companion object {

        var appContext: Context? = null
            private set
    }
}
