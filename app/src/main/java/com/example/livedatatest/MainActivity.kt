package com.example.livedatatest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedatatest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding : ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var viewModelFactory : ViewModelProvider.AndroidViewModelFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Get the ViewModel
        viewModelFactory = ViewModelProvider.AndroidViewModelFactory.getInstance(application)
        viewModel = ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)

        // DataBinding with MainView model
        dataBinding.viewModel = viewModel
        // 라이프 사이클 오너 등록
        dataBinding.setLifecycleOwner (this)


    }
}
