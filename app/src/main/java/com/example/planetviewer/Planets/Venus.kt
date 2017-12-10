package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Venus(context: Context):Planet(
        name = "Venus",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.venus),
        distanceFromSun = 108,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Venus")