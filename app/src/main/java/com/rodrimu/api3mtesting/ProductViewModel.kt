package com.rodrimu.api3mtesting

import androidx.lifecycle.*
import kotlinx.coroutines.launch

class ProductViewModel : ViewModel() {

    private val service = ProductService.create()
    private val _products = MutableLiveData<List<Product>>()
    val products: LiveData<List<Product>> = _products

    init {
        viewModelScope.launch {
            try {
                val response = service.getProducts()
                _products.value = response.products
                println("Productos cargados: ${response.products.size}")
            } catch (e: Exception) {
                e.printStackTrace()
                println("Error al obtener productos: ${e.message}")
            }
        }
    }
}