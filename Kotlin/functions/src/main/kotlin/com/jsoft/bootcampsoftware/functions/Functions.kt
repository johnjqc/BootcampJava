package com.jsoft.bootcampsoftware.functions

import java.util.stream.IntStream

object Funciones {

    private const val NUMERO_MULTIPLO_DE_PAR = 2

    private infix fun Int.doubleDiv(i: Int): Double = this / i.toDouble()

    infix fun Int.esMultiplo(numero:Int):Boolean = this % numero == 0

    fun esPar(numero: Int) = numero esMultiplo NUMERO_MULTIPLO_DE_PAR

    fun esInpar(numero: Int) = esPar(numero).not()

    fun esBiciesto(year: Int) = year esMultiplo 4 && (year esMultiplo 400 || (year esMultiplo 100).not())

    fun numeroMayor(vararg numeros:Int) = numeros.max()

    fun secuenciaUno(valor:Int):Double = IntStream.range(1, valor + 1)
            .mapToDouble { 1 doubleDiv it }
            .reduce{ left, right -> left + right}
            .orElse(0.0)


}