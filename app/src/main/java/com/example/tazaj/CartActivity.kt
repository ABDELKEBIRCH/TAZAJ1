package com.example.tazaj1

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tazaj1.R

class CartActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var cartAdapter: CartAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        recyclerView = findViewById(R.id.recyclerViewCart)
        recyclerView.layoutManager = LinearLayoutManager(this)

        cartAdapter = CartAdapter(Cart.items)
        recyclerView.adapter = cartAdapter

        val totalPrice = Cart.getTotalPrice()
        findViewById<TextView>(R.id.textTotalPrice).text = "Total: $totalPrice"
    }
}
