package com.example.coffeshop

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var editItem :EditText
    lateinit var ebutton:Button
    lateinit var eTextView:TextView
    lateinit var ebuttonNext:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        editItem = findViewById(R.id.editTextTextItem)
        ebutton = findViewById(R.id.buttonShow)
        eTextView= findViewById(R.id.textViewResults)
        ebuttonNext= findViewById(R.id.btnshop)

        ebutton.setOnClickListener{

            var getvalue= editItem.text.toString()

            if(getvalue.isEmpty())
            {
                eTextView.setText("Please make sure you insert a value ")
            }
            else {

                var value1: Int = Integer.parseInt(getvalue)

                // When statement
                when (value1) {

                    5-> eTextView.setText("items 0% discount : " + value1)//Toast.makeText(this, "5 items", Toast.LENGTH_LONG).show()
                    10-> eTextView.setText("items 5% discount : " + value1)//Toast.makeText(this, "10 items", Toast.LENGTH_LONG).show()
                    15-> eTextView.setText("items 10% discount : " + value1 )//Toast.makeText(this, "15 items", Toast.LENGTH_LONG).show()
                    else -> {
                        Toast.makeText(this, "Out of range", Toast.LENGTH_LONG).show()
                    }
                }
            }

        }
        ebuttonNext.setOnClickListener{

            val intent2 = Intent (this,ShopActivity::class.java)

            startActivity(intent2)
        }

    }
}