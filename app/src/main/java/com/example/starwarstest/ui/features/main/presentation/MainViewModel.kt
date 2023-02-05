package com.example.starwarstest.ui.features.main.presentation

import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.starwarstest.ui.features.global.WorkManagerWrapper

class MainViewModel(
    //private val workManagerWrapper: WorkManagerWrapper,
    private val navigationCommunication: NavigationCommunication.Mutable
) : ViewModel(), Init, Communication.Observe<NavigationStrategy> {

    override fun init(isFirstRun: Boolean) {
        if (isFirstRun) {
            navigationCommunication.map(NavigationStrategy.Replace(Screen.Splash))
            //workManagerWrapper.start()
        }
    }

    override fun observe(owner: LifecycleOwner, observer: Observer<NavigationStrategy>) =
        navigationCommunication.observe(owner, observer)
}