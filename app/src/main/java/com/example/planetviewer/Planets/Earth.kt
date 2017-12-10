package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Earth(context: Context):Planet(
        name = "Earth",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.earth),
        distanceFromSun = 150,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.life_icon),
        link = "https://en.wikipedia.org/wiki/Earth")