package com.example.starwarstest.ui.features.splash.sl

import com.example.starwarstest.ui.features.main.sl.CoreModule
import com.example.starwarstest.ui.features.main.sl.Module
import com.example.starwarstest.ui.features.splash.SplashViewModel

class SplashModule(private val coreModule : CoreModule) : Module<SplashViewModel> {

    override fun viewModel(): SplashViewModel = SplashViewModel()

}