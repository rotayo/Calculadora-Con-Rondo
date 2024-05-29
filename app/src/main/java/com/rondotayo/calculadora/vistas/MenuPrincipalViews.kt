package com.rondotayo.calculadora.vistas

class MenuPrincipalViews {
    fun MostrarMenu(){
        println("-----Calculadora-----\n" +
                "1 - Sumar \n" +
                "2 - Restar \n" +
                "3 - Multiplicar \n" +
                "4 - Dividir \n");
    }

    fun Opcion():Int {
        print("Digite una Opcion: ");
        val stringInput:String? = readLine();
        return when(stringInput){
            "1" -> 1;
            "2" -> 2;
            "3" -> 3;
            "4" -> 4;
            else -> 0
        }
    }
}