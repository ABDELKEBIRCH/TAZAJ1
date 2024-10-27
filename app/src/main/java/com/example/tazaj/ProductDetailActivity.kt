package com.example.tazaj1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tazaj1.R

@Suppress("DEPRECATION")
class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val product = intent.getParcelableExtra<Product>("product")

        findViewById<TextView>(R.id.textProductName).text = product?.name
        findViewById<TextView>(R.id.textProductDescription).text = product?.description
        findViewById<TextView>(R.id.textProductPrice).text = product?.price.toString()

        findViewById<Button>(R.id.buttonAddToCart).setOnClickListener {
            product?.let {
                Cart.addProduct(it)
                Toast.makeText(this, "${it.name} ajouté au panier!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
