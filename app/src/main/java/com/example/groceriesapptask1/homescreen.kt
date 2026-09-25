package com.example.groceriesapptask1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment




class homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_homescreen)

        val navShop=findViewById<LinearLayout>(R.id.navShop)

        val navCart=findViewById<LinearLayout>(R.id.navcart)
        val navAcc=findViewById<LinearLayout>(R.id.navaccount)
        val navFav=findViewById<LinearLayout>(R.id.navfav)


        val navExp = findViewById<LinearLayout>(R.id.navexplore)

        navExp.setOnClickListener {
            val intent = Intent(this, explore::class.java)
            startActivity(intent)

        }

        navCart.setOnClickListener {
            val intent = Intent(this, explore::class.java)
            startActivity(intent)

        }

        navShop.setOnClickListener {
            val intent = Intent(this, homescreen::class.java)
            startActivity(intent)

        }

        navAcc.setOnClickListener {
            val intent = Intent(this, explore::class.java)
            startActivity(intent)

        }

        navFav.setOnClickListener {
            val intent = Intent(this, explore::class.java)
            startActivity(intent)

        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}