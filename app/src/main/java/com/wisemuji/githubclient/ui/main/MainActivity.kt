package com.wisemuji.githubclient.ui.main

import androidx.appcompat.app.AppCompatActivity
import androidx.activity.viewModels
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.wisemuji.githubclient.R
import com.wisemuji.githubclient.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupBinding()
    }

    private fun setupBinding() {
        binding = DataBindingUtil
            .setContentView<ActivityMainBinding>(this, R.layout.activity_main)
            .also {
                it.lifecycleOwner = this
                it.viewModel = viewModel
            }
    }
}
