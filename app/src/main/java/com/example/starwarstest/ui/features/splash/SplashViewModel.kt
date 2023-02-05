package com.example.starwarstest.ui.features.splash

import androidx.lifecycle.ViewModel
import com.example.starwarstest.ui.features.main.presentation.Init

/**
 * Imagine that we need to download all movies here and show in 3seconds if no, continue download them in main screen
 *
 * Check internet connection on splash ?
 */
class SplashViewModel : ViewModel(), Init {

    override fun init(isFirstRun: Boolean) {
        if (isFirstRun){
            
        }
    }

}