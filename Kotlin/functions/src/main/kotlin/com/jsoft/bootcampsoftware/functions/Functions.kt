package com.jsoft.bootcampsoftware.functions

import java.util.stream.IntStream

object Funciones {

    private const val NUMERO_MULTIPLO_DE_PAR = 2

    private infix fun Int.doubleDiv(i: Int): Double = this / i.toDouble()

    infix fun Int.esMultiplo(numero:Int):Boolean = this % numero == 0

    fun Int.esPar() = this esMultiplo NUMERO_MULTIPLO_DE_PAR

    fun Int.esInpar() = this.esPar().not()

    fun Int.esBiciesto() = this esMultiplo 4 && (this esMultiplo 400 || (this esMultiplo 100).not())

    fun numeroMayor(vararg numeros:Int) = numeros.max()

    fun Int.secuenciaUno():Double = IntStream.range(1, this + 1)
            .mapToDouble { 1 doubleDiv it }
            .reduce{ left, right -> left + right}
            .orElse(0.0)


}