package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Mars(context: Context):Planet(
        name = "Mars",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.mars),
        distanceFromSun = 228,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Mars")