package com.example.starwarstest.ui.features.main.sl

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import com.example.starwarstest.ui.features.main.presentation.ProvideViewModel

/**
 * 1й этап:
 * - Сплэш экран, список фильмов, детальная страница фильмов
 * - данные тянутся на каждом экране
 * - каждый экран отдельная фича
 *
 */

class App : Application(), ProvideViewModel {

    private lateinit var viewModelsFactory: ViewModelsFactory
    private lateinit var dependencyContainer: DependencyContainer.Base

    override fun onCreate() {
        super.onCreate()
        dependencyContainer = DependencyContainer.Base(CoreModule.Base(this))
        viewModelsFactory = ViewModelsFactory(dependencyContainer)
    }

    override fun <T : ViewModel> provideViewModel(clazz: Class<T>, owner: ViewModelStoreOwner): T =
        ViewModelProvider(owner, viewModelsFactory)[clazz]

}