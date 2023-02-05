package com.example.starwarstest.ui.features.main.sl

import android.content.Context
import com.example.starwarstest.ui.features.main.presentation.NavigationCommunication

interface CoreModule : ProvideNavigation  {

    class Base(private val context : Context) : CoreModule {

        private val navigationCommunication = NavigationCommunication.Base()

        override fun provideNavigation(): NavigationCommunication.Mutable {
            return navigationCommunication
        }

    }

}

interface ProvideNavigation {
    fun provideNavigation() : NavigationCommunication.Mutable
}