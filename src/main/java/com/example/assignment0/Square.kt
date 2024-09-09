package com.example.assignment0

class Square(_name : String) : Shape(_name), Dimensionable{

    private var length: Double = 0.0
    private var height: Double = 0.0

    override fun setDimensions(_first : Double, _second: Double, _third: Double): Unit {
        length = _first
        height = _second
    }

    override fun getName() {
        println("Get name: $name")
    }
    override fun getArea(): Double {
        return length * height

    }

    override fun printDimensions() : String {
        println("Square: \nLength: $length\nHeight: $height")
        return "Square: \nLength: $length\nHeight: $height"
    }
}