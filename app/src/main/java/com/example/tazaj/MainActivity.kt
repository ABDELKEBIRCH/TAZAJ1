package com.example.tazaj1

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tazaj1.R

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var productAdapter: ProductAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerViewProducts)
        recyclerView.layoutManager = LinearLayoutManager(this)

        // Exemple de produits
        val productList = listOf(
            Product("Pomme", "Une pomme rouge délicieuse.", 1.5),
            Product("Banane", "Une banane mûre.", 1.0),
            Product("Carotte", "Une carotte croquante.", 0.5)
        )

        productAdapter = ProductAdapter(productList) { product ->
            val intent = Intent(this, ProductDetailActivity::class.java)
            intent.putExtra("product", product) // Envoie le produit
            startActivity(intent)
        }

        recyclerView.adapter = productAdapter
    }
}
