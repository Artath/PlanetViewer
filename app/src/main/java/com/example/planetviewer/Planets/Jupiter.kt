package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Jupiter(context: Context):Planet(
        name = "Jupiter",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.jupiter),
        distanceFromSun = 778,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Jupiter")