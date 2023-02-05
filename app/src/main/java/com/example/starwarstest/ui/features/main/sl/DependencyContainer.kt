package com.example.starwarstest.ui.features.main.sl

import androidx.lifecycle.ViewModel
import com.example.starwarstest.ui.features.main.presentation.MainViewModel
import com.example.starwarstest.ui.features.splash.SplashViewModel
import com.example.starwarstest.ui.features.splash.sl.SplashModule

/**
 * @author Asatryan on 30.09.2022
 */
interface DependencyContainer {

    fun <T : ViewModel> module(clasz: Class<T>): Module<*>

    class Error : DependencyContainer {
        override fun <T : ViewModel> module(clasz: Class<T>): Module<*> =
            throw IllegalStateException("no module found for $clasz")
    }

    class Base(
        private val core: CoreModule,
        private val dependencyContainer: DependencyContainer = Error()
    ) : DependencyContainer {


        override fun <T : ViewModel> module(clasz: Class<T>): Module<*> = when (clasz) {
            SplashViewModel::class.java -> SplashModule(core)
            MainViewModel::class.java -> MainModule(core)
            else -> dependencyContainer.module(clasz)
        }

    }
}