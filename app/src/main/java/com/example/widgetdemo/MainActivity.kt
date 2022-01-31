package com.example.widgetdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun radioButtonClick(view: View) {
        // check which radio button was clicked
        val message: String
        if (view == male){
            message = "Male"
        }
        else if (view == female){
            message = "Female"
        }
        else {
            message = "Other"
        }

        // Make a toast message to show
        val toast = Toast.makeText(this, message, Toast.LENGTH_SHORT)
        // setting toast at center with a negative y offset value
        toast.setGravity(Gravity.CENTER, 0, -440)
        toast.show()
    }

    fun checkBoxClick(view: View) {
        // check which checkbox  was checked
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked
            when (view.id) {
                R.id.car -> {
                    if (checked) {
                        // Selected car - do something
                    }
                    else {
                        // Unselected car - do something
                    }
                }
                R.id.bus -> {
                    if (checked){
                        // Selected bus - do something
                    }
                    else {
                        // Unselected bus - do something
                    }
                }
                R.id.truck -> {
                    if (checked){
                        // Selected truck - do something
                    }
                    else {
                        // Unselected truck - do something
                    }
                }
                R.id.bike -> {
                    if (checked){
                        // Selected bike - do something
                    }
                    else {
                        // Unselected bike - do something
                    }
                }
            }
        }
    }

    fun switchClick(view: View) {
        // check if switch is checked
        if (switch_rent.isChecked){
            switch_rent.text = "Rent" // optionally we can change to text of it
            Toast.makeText(this, "You selected rent", Toast.LENGTH_SHORT).show()
        }
        else{
            switch_rent.text = "Not Rent" // optionally we can change to text of it
            Toast.makeText(this, "You unselected rent", Toast.LENGTH_SHORT).show()
        }
    }
}