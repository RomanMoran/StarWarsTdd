package com.example.starwarstest.ui.features.main.sl

import com.example.starwarstest.ui.features.main.presentation.MainViewModel

class MainModule(private val coreModule: CoreModule) : Module<MainViewModel> {

    override fun viewModel(): MainViewModel = MainViewModel(coreModule.provideNavigation())

}