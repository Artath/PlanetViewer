package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Uranus(context: Context):Planet(
        name = "Uranus",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.uranus),
        distanceFromSun = 2886,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Uranus")