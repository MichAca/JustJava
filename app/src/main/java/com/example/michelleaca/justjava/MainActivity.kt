package com.example.michelleaca.justjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


/**
 * This app displays an order form to order coffee.
 */
class   MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /**
     * declaring a global variable
     */
    var quantity = 0
    var price = 5
    var priceMessage = ""

    /**
     * This method is called when the plus button is clicked.
     */
    fun increment(view: View) {
        quantity += 1
        display(quantity)
    }
    /**
     * This method is called when the minus button is clicked.
     */
    fun decrement(view: View) {
        quantity -= 1
        display(quantity)
    }
    /**
     * This method is called when the order button is clicked.
     */

    private fun calculatePrice () {
        price *= quantity
        return calculatePrice()
    }
    fun submitOrder(view: View) {
        orderSummary("")
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private fun display(number: Int) {
            quantity_text_view.text = quantity.toString()
        }
    private fun displayMessage(message: String) {
        order_text_view.text = priceMessage
    }
    private fun orderSummary(message: String) {
        priceMessage = "Name: Michelle"
        priceMessage = "$priceMessage \nQuantity:  $quantity coffees"
        priceMessage = "$priceMessage \nTotal: Php. ${this.calculatePrice()}"
        priceMessage = "$priceMessage \n\nThank you!"
        displayMessage(priceMessage)
    }
}



