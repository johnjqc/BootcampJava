package com.jsoft.bootcampsoftware.functions

import java.util.stream.IntStream

object Funciones {

    private const val NUMERO_MULTIPLO_DE_PAR = 2

    fun esMultiplo(numero1:Int, numero2:Int) = numero1 % numero2 == 0

    fun esPar(numero: Int) = esMultiplo(numero, NUMERO_MULTIPLO_DE_PAR)

    fun esInpar(numero: Int) = esPar(numero).not()

    fun esBiciesto(year: Int) = esMultiplo(year, 4) && (esMultiplo(year, 400) || esMultiplo(year, 100).not())

    fun numeroMayor(numero1:Int, numero2:Int, numero3:Int) = numeroMayor(numeroMayor(numero1, numero2), numero3)

    private fun numeroMayor(numero1:Int, numero2:Int) = when {
        numero1 > numero2 -> numero1
        else -> numero2
    }

    fun secuenciaUno(valor:Int):Double = IntStream.range(1, valor + 1)
            .mapToDouble { 1 doubleDiv it }
            .reduce{ left, right -> left + right}
            .orElse(0.0)
    
    private infix fun Int.doubleDiv(i: Int): Double = this / i.toDouble()



}