package com.rondotayo.calculadora

import androidx.core.app.NotificationCompat.Action
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

    ImprimirNumero(opcion, num1, num2)
}

fun ImprimirNumero(opcion: Int, num1: Int, num2: Int ){
    when(opcion){
        1 -> println(funcionesMatematicas.sumar(num1, num2))
        2 -> println(funcionesMatematicas.restar(num1, num2))
        3 -> println(funcionesMatematicas.multiplicar(num1, num2))
        4 -> println(funcionesMatematicas.dividir(num1, num2))
        else -> println("Opcion equivocada");
    }
}
