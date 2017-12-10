package com.example.planetviewer

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.example.planetviewer.Planets.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var data:Array<Planet> = arrayOf(
                Mercury(applicationContext),
                Venus(applicationContext),
                Earth(applicationContext),
                Mars(applicationContext),
                Jupiter(applicationContext),
                Saturn(applicationContext),
                Uranus(applicationContext),
                Neptune(applicationContext))

        recyclerView.layoutManager = GridLayoutManager(applicationContext, 2)
        recyclerView.adapter = PlanetAdapter(data)
        recyclerView.adapter.notifyDataSetChanged()
    }
}
