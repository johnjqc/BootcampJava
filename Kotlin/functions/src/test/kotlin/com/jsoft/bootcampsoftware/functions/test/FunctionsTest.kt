package com.jsoft.bootcampsoftware.functions.test

import com.jsoft.bootcampsoftware.functions.Funciones
import com.jsoft.bootcampsoftware.functions.Funciones.esMultiplo
import com.jsoft.bootcampsoftware.functions.Funciones.esPar
import com.jsoft.bootcampsoftware.functions.Funciones.esInpar
import com.jsoft.bootcampsoftware.functions.Funciones.esBiciesto
import com.jsoft.bootcampsoftware.functions.Funciones.secuenciaUno
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

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

        assertThat(10.esPar()).isTrue()
    }

    @Test
    fun testEsParFail() {

        assertThat(9.esPar()).isFalse()
    }

    @Test
    fun testEsInparOk() {

        assertThat(9.esInpar()).isTrue()
    }

    @Test
    fun testEsInparFail() {

        assertThat(10.esInpar()).isFalse()
    }

    @Test
    fun testEsViciestoOk() {

        assertThat(2016.esBiciesto()).isTrue()
    }

    @Test
    fun testEsViciestoFail() {

        assertThat(1900.esBiciesto()).isFalse()
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


        assertThat(3.secuenciaUno()).isEqualTo(1.8333333333333333)
    }

}