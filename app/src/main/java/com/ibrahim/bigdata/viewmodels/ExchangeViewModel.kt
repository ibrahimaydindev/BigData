package com.ibrahim.bigdata.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import com.ibrahim.bigdata.models.ExchangeRateResponse
import com.ibrahim.bigdata.repository.ExchangeRepository
import kotlinx.coroutines.launch

class ExchangeViewModel(private val repository: ExchangeRepository) : ViewModel() {

    val allExchanges: LiveData<List<ExchangeRateResponse>> = repository.allExchanges.asLiveData()

    suspend fun insert(exchangeRateResponse: ExchangeRateResponse) = viewModelScope.launch {
        repository.insertExchangeRates(exchangeRateResponse)
    }

    class ExchangeViewModelFactory(private val repository: ExchangeRepository) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(ExchangeRateResponse::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return ExchangeViewModel(repository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}