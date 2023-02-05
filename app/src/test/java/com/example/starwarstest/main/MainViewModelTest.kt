package com.example.starwarstest.main

import com.example.starwarstest.base.BaseTest
import com.example.starwarstest.ui.features.main.presentation.MainViewModel
import com.example.starwarstest.ui.features.main.presentation.NavigationStrategy
import com.example.starwarstest.ui.features.main.presentation.Screen
import junit.framework.TestCase.assertEquals
import org.junit.Test

class MainViewModelTest() : BaseTest() {

    @Test
    fun `test navigation on start`(){
        val navigation = TestNavigationCommunication()
        val mainViewModel = MainViewModel(navigation)

        mainViewModel.init(true)
        assertEquals(1, navigation.count)
        assertEquals(NavigationStrategy.Replace(Screen.Splash), navigation.strategy)

        mainViewModel.init(false)
        assertEquals(1, navigation.count)
    }

}
