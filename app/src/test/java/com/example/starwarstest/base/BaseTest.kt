package com.example.starwarstest.base

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import com.example.starwarstest.ui.features.main.presentation.NavigationCommunication
import com.example.starwarstest.ui.features.main.presentation.NavigationStrategy

abstract class BaseTest {

    protected class TestNavigationCommunication : NavigationCommunication.Mutable {

        lateinit var strategy: NavigationStrategy
        var count = 0

        override fun observe(owner: LifecycleOwner, observer: Observer<NavigationStrategy>) = Unit

        override fun map(source: NavigationStrategy) {
            strategy = source
            count++
        }

    }

}