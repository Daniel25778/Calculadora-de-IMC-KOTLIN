package com.example.imc

import java.math.RoundingMode

fun  calcularImc(peso: Int, altura:Double):Double{
    val imc = peso / (altura * altura)
    return imc.toBigDecimal().setScale(1, RoundingMode.UP).toDouble()
}

fun condicaoImc(){

}