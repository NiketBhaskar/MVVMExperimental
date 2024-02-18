package com.revia.mvvmexperimental.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.revia.mvvmexperimental.model.AuthListner
import com.revia.mvvmexperimental.model.Service

class MainViewModel(val service: Service): ViewModel() {
    var _status : MutableLiveData<AuthListner> = MutableLiveData()
    var status: LiveData<AuthListner> = _status as LiveData<AuthListner>

    fun login(userName:String, userPass:String){
        service.login(userName, userPass){
            _status.value = it
        }
    }
}