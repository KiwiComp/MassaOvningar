package com.example.fragment_ovningar

import android.os.Bundle
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val appetizerOne = findViewById<LinearLayout>(R.id.appetizer1)
        val appetizerTwo = findViewById<LinearLayout>(R.id.appetizer2)

        appetizerOne.setOnClickListener {
            displayAppetizerOne()
        }

        appetizerTwo.setOnClickListener {
            displayAppetizerTwo()
        }
    }

    fun displayAppetizerOne() {
        val fragment = AppetizerOneFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()

    }

    fun displayAppetizerTwo() {
        val fragment = AppetizerTwoFragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}