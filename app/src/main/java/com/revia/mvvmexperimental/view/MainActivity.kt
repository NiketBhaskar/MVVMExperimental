package com.revia.mvvmexperimental.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.revia.mvvmexperimental.R
import com.revia.mvvmexperimental.model.Service
import com.revia.mvvmexperimental.viewModel.MainViewModel
import com.revia.mvvmexperimental.viewModel.MainViewModelFactory

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel = ViewModelProvider(this, MainViewModelFactory(Service()))[MainViewModel::class.java]
        mainViewModel.status.observe(this, Observer {
            if(it.status){
                println("${it.msg}")
            }else{
                println("${it.msg}")
            }
        })
    }
}