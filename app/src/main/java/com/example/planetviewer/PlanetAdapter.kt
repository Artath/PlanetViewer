package com.example.planetviewer

import android.content.Intent
import android.os.Bundle
import android.provider.ContactsContract
import android.support.v4.content.ContextCompat.startActivity
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.example.planetviewer.Planets.Planet
import kotlinx.android.synthetic.main.item.view.*


class PlanetAdapter(var data:Array<Planet>):RecyclerView.Adapter<PlanetAdapter.PlanetViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            PlanetViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))

    override fun getItemCount() = data.size

    override fun onBindViewHolder(holder: PlanetViewHolder, position: Int) {
        holder.img.setImageBitmap(data[position].img)
        holder.lifeImg.setImageBitmap(data[position].isLifeIcon)
        holder.nameTextView.text = data[position].name
        holder.distanceTextView.text = "Distance from the Sun: \n" + data[position].distanceFromSun + " millions km."
        holder.button.setOnClickListener({
            var intent = Intent(holder.button.context, WebViewActivity::class.java)
            intent.putExtra("link", data[position].link)
            startActivity(holder.button.context, intent, Bundle.EMPTY)
        })

    }

    class PlanetViewHolder(view: View):RecyclerView.ViewHolder(view) {
        var img: ImageView = view.planet_imageView
        var nameTextView: TextView = view.name_textView
        var distanceTextView: TextView = view.distance_textView
        var button: Button = view.buttonView
        var lifeImg: ImageView = view.lifeIcon_imageView
    }


}