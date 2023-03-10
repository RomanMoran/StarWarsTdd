package com.example.starwarstest.ui.features.main.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel

/**
 * @author Asatryan on 01.10.2022
 */
abstract class BaseFragment<T : ViewModel> : Fragment() {

    protected lateinit var viewModel: T
    protected abstract val viewModelClass: Class<T>
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = (requireActivity() as ProvideViewModel).provideViewModel(viewModelClass, this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(layoutId, container, false)
}