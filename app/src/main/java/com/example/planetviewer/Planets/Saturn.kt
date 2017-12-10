package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Saturn(context: Context):Planet(
        name = "Saturn",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.saturn),
        distanceFromSun = 1427,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Saturn")