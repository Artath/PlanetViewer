package com.example.planetviewer.Planets

import android.content.Context
import android.content.res.Resources
import android.graphics.BitmapFactory
import com.example.planetviewer.R

class Mercury(context: Context):Planet(
        name = "Mercury",
        img = BitmapFactory.decodeResource(context.resources, R.drawable.mercury),
        distanceFromSun = 58,
        isLifeIcon = BitmapFactory.decodeResource(context.resources, R.drawable.no_life_icon),
        link = "https://en.wikipedia.org/wiki/Mercury_(planet)")