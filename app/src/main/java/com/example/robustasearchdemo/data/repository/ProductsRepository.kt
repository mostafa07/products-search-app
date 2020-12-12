package com.example.robustasearchdemo.data.repository

import com.example.robustasearchdemo.data.model.Product

object ProductsRepository {

    private val productsList: List<Product> = listOf(
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        ),
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        ),
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        ),
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        ),
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        ),
        Product(
            name = "Coffee",
            price = 18F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Cappuccino",
            price = 30F,
            imageUrl = "https://images.unsplash.com/photo-1472973681244-f5bcc808ad47?ixid=MXwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHw%3D&ixlib=rb-1.2.1&auto=format&fit=crop&w=1506&q=80"
        ),
        Product(
            name = "Tea",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/1020618/4098/i/950/depositphotos_40984715-stock-photo-transparent-cup-of-green-tea.jpg"
        ),
        Product(
            name = "Iced Mocha",
            price = 30F,
            imageUrl = "https://static4.depositphotos.com/1015060/446/i/950/depositphotos_4466399-stock-photo-hot-chocolate.jpg"
        ),
        Product(
            name = "Latte",
            price = 30F,
            imageUrl = "https://static8.depositphotos.com/1177973/972/i/450/depositphotos_9720570-stock-photo-fragrant-offee-latte-in-glass.jpg"
        ),
        Product(
            name = "Turkish Coffee",
            price = 30F,
            imageUrl = "https://st.depositphotos.com/3113899/4908/i/950/depositphotos_49081345-stock-photo-cup-of-turkish-coffee-with.jpg"
        )
    )

    // Dummy data for simple mocking of web service call
    public fun getProductsList(): List<Product> {
        return productsList
    }
}