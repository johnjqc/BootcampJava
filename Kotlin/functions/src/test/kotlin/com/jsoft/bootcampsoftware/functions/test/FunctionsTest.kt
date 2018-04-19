package com.jsoft.bootcampsoftware.functions.test

import com.jsoft.bootcampsoftware.functions.Funciones
import com.jsoft.bootcampsoftware.functions.Funciones.esMultiplo
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.util.function.IntBinaryOperator
import java.util.stream.IntStream

class FunctionsTest {

    @Test
    fun testEsMultiploOk() {

        assertThat(10 esMultiplo 2).isTrue()
    }

    @Test
    fun testEsMultiploFail() {

        assertThat(10 esMultiplo 3).isFalse()
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


        assertThat(Funciones.secuenciaUno(3)).isEqualTo(1.8333333333333333)
    }

}