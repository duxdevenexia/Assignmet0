package com.example.assignment0

abstract class Shape(_name : String) : Dimensionable {

    var name = _name

    open fun getArea(): Double {
        return 0.0;
    }

    abstract fun getName()     // abstract constructor


}