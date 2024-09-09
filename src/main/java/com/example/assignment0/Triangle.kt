package com.example.assignment0

import kotlin.math.sqrt

open class Triangle(_name : String) : Shape(_name) {

    open var firstSide: Double = 0.0
    open var secondSide: Double = 0.0
    open var thirdSide: Double = 0.0


    override fun setDimensions(_first: Double, _second: Double, _third : Double) {
        firstSide = _first
        secondSide = _second
        thirdSide = _third
    }

    override fun getName() {
        println("Get name: $name")
    }


    override fun printDimensions() {
        println("Square: \nfirstSide: $firstSide\nSecondSide: $secondSide\nThirdSide: $thirdSide")
    }

    override fun getArea(): Double {
        var s = firstSide + secondSide + thirdSide

        return sqrt(s*(s-firstSide) * (s-secondSide) * (s-thirdSide))
    }


}