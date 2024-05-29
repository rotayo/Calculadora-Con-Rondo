package com.rondotayo.calculadora.Funciones

fun sumar(primero:Int,segundo:Int):Int{
    return primero + segundo
}
fun dividir(numerador:Int, denominador:Int):Int{
    var numero:Int =0
    if(denominador == 0){
        print("plis plas plus no se puede dividr entre cero")
    }else {
        numero= numerador / denominador
    }
    return numero
}

fun multiplicar(primero:Int, segundo:Int):Int{
    return primero *segundo
}
fun restar(positivo:Int, negativo:Int):Int{
    return positivo-negativo
}
fun modulo(numero:Int, moduLo:Int):Int{
    val resultado:Int =numero %moduLo
    return resultado
}