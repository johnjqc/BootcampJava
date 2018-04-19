package com.jsoft.bootcampsoftware.functions.test

import com.jsoft.bootcampsoftware.functions.Funciones
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.function.IntBinaryOperator
import java.util.stream.IntStream

class FunctionsTest {

    @Test
    fun testEsMultiploOk() {

        assertThat(Funciones.esMultiplo(10, 2)).isTrue()
    }

    @Test
    fun testEsMultiploFail() {

        assertThat(Funciones.esMultiplo(10, 3)).isFalse()
    }

    @Test
    fun testEsParOk() {

        assertThat(Funciones.esPar(10)).isTrue()
    }

    @Test
    fun testEsParFail() {

        assertThat(Funciones.esPar(9)).isFalse()
    }

    @Test
    fun testEsInparOk() {

        assertThat(Funciones.esInpar(9)).isTrue()
    }

    @Test
    fun testEsInparFail() {

        assertThat(Funciones.esInpar(10)).isFalse()
    }

    @Test
    fun testEsViciestoOk() {

        assertThat(Funciones.esBiciesto(2016)).isTrue()
    }

    @Test
    fun testEsViciestoFail() {

        assertThat(Funciones.esBiciesto(1900)).isFalse()
    }

    @Test
    fun testNumeroMayorOk() {

        assertThat(Funciones.numeroMayor(1, 2, 3)).isEqualTo(3)
    }

    @Test
    fun testNumeroMayorOk2() {

        assertThat(Funciones.numeroMayor(2, 1, 3)).isEqualTo(3)
    }

    @Test
    fun testNumeroMqyorOk3() {

        assertThat(Funciones.numeroMayor(2, 3, 1)).isEqualTo(3)
    }

    @Test
    fun testNumeroMqyorOk4() {

        assertThat(Funciones.numeroMayor(3, 2, 1)).isEqualTo(3)
    }

    @Test
    fun testSecuenciaUno() {
//        print(" sdf " + Funciones.secuenciaUno(3))

        val res = IntStream.range(1, 4)
                .mapToDouble { 1 / it.toDouble() }
                .reduce{ left, ri -> left + ri}

        print("res: $res")

        assertThat(Funciones.secuenciaUno(3)).isEqualTo(0.3)
    }

}