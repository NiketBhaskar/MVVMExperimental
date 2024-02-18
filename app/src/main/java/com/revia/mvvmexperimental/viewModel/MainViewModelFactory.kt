package com.revia.mvvmexperimental.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.revia.mvvmexperimental.model.Service

class MainViewModelFactory(val service : Service) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(service) as T
    }
}