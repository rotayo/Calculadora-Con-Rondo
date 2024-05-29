package com.rondotayo.calculadora

import com.rondotayo.calculadora.Funciones.FuncionesMatematicas
import com.rondotayo.calculadora.vistas.MenuPrincipalViews

val view = MenuPrincipalViews()
val funcionesMatematicas = FuncionesMatematicas()

fun main(){
    view.MostrarMenu()
    val opcion:Int = view.Opcion();

    print("Escriba el numero 1: ")
    val num1 = readLine()!!.toInt()
    print("Escriba el numero 2: ")
    val num2 = readLine()!!.toInt()

    when(opcion){
        1 -> funcionesMatematicas.sumar(num1, num2)
        2 -> funcionesMatematicas.restar(num1, num2)
        3 -> funcionesMatematicas.multiplicar(num1, num2)
        4 -> funcionesMatematicas.dividir(num1, num2)
        else -> println("Opcion equivocada");
    }
}

