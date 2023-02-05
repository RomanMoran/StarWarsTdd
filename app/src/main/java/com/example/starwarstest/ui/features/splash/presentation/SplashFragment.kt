package com.example.starwarstest.ui.features.splash.presentation

import android.os.Bundle
import android.view.View
import com.example.starwarstest.R
import com.example.starwarstest.ui.features.main.presentation.BaseFragment
import com.example.starwarstest.ui.features.splash.SplashViewModel

class SplashFragment : BaseFragment<SplashViewModel>() {

    override val viewModelClass = SplashViewModel::class.java
    override val layoutId: Int = R.layout.fragment_splash

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }


}