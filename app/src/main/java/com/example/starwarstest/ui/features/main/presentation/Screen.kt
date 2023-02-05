package com.example.starwarstest.ui.features.main.presentation

import com.example.starwarstest.ui.features.splash.presentation.SplashFragment

sealed class Screen {

    abstract fun fragment(): Class<out BaseFragment<*>>

    object Splash : Screen() {
        override fun fragment(): Class<out BaseFragment<*>> = SplashFragment::class.java
    }
}