package com.example.planetviewer.Planets

import android.graphics.Bitmap

open class Planet(
        var name:String,
        var img:Bitmap,
        var distanceFromSun:Int,
        var isLifeIcon:Bitmap,
        var link:String)