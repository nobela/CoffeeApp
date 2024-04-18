package com.example.coffeshop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView

class ShopActivity : AppCompatActivity() {

    lateinit var eviewList :TextView

    val NamesList = arrayListOf("Ephraim","nobela")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        val listView= findViewById<ListView>(R.id.itemsList)
        val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,NamesList)
        listView.adapter=adapter
/*
        eviewList = findViewById(R.id.textViewList)

        var mutableList1= mutableListOf("Ajay","Ephraim")

        for (element in mutableList1)
        {
            eviewList.setText(element)

        }

 */
    }
}