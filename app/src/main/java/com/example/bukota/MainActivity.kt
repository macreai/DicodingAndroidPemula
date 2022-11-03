package com.example.bukota

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCity: RecyclerView
    private var list: ArrayList<City> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val actionBar = supportActionBar
        actionBar!!.title = "List Kota"

        rvCity = findViewById(R.id.rv_city)
        rvCity.setHasFixedSize(true)

        list.addAll(CityData.listData)
        showRecycleList()


    }

    private fun showRecycleList(){
        rvCity.layoutManager = LinearLayoutManager(this)
        val listCityAdapter = ListCityAdapter(list)
        rvCity.adapter = listCityAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.profile, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectMode: Int){
        when(selectMode){
            R.id.my_profile -> {
                val iProfile = Intent(this@MainActivity, AboutMe::class.java)
                startActivity(iProfile)
            }
        }
    }
}