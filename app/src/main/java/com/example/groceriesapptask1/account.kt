package com.example.groceriesapptask1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.groceriesapptask1.AccountAdapter
import com.example.groceriesapptask1.AccountItem
import com.example.groceriesapptask1.R


class account : AppCompatActivity() {


    private lateinit var accountRecyclerView: RecyclerView
    private lateinit var accountList: ArrayList<AccountItem>
   private lateinit var itemList:Array<Int>
    private lateinit var titleList:Array<String>


    private fun getData() {
        TODO("Not yet implemented")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_account)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        itemList= arrayOf(
            R.drawable.shop,
            R.drawable.explore,
            R.drawable.cart,
            R.drawable.fav,
            R.drawable.account
        )

        titleList= arrayOf(
            "Shop",
            "Explore",
            "Cart",
            "Favourite",
            "Account"
        )

            accountRecyclerView = findViewById(R.id.accountRecyclerView)
            accountRecyclerView.layoutManager = LinearLayoutManager(this)
            accountRecyclerView.setHasFixedSize(true)

            accountList = arrayListOf()
            getData()



        )


        fun getData(){
            for(i in itemList.indices ){
                val item = AccountItem(titleList[i],itemList[i])
                accountList.add(item)
            }
            accountRecyclerView.adapter = AccountAdapter(accountList)
        }






        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}