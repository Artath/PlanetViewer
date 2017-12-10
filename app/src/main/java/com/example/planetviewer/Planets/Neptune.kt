package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Neptune(context: Context):Planet(
        name = "Neptune",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.neptune),
        distanceFromSun = 5912,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Neptune")