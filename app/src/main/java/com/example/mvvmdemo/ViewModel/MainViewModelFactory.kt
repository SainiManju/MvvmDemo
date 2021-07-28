package com.example.mvvmdemo.View

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmdemo.Repository.QuoteRepository


class MainViewModelFactory(private val quoteRepository: QuoteRepository) : ViewModelProvider.Factory{
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return MainViewModel(quoteRepository) as T
    }
}