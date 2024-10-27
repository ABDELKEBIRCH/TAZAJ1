import com.example.tazaj1.Product

object Cart {
    val items = mutableListOf<Product>()

    fun addProduct(product: Product) {
        items.add(product)
    }

    fun clearCart() {
        items.clear()
    }

    fun getTotalPrice(): Double {
        return items.sumOf { it.price }
    }
}
