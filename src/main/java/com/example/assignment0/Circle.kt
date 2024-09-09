package com.example.assignment0

class Circle(_name : String) : Shape(_name) {


    private var radius: Double = 0.0

    override fun setDimensions(_first : Double, _second: Double, _third: Double) {
        radius = _first
    }

    override fun printDimensions() {
        println("Circle: \n Radius: $radius")
    }

    override fun getName() {
        println("Get name: $name")
    }
}