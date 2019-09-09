package com.example.bhaskara;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MatematicaTeste {
    @Test
    public void CalculaPotenciaInteiroPositivo() {
        double ValorEsperado = 2.0;
        double base = 2.0;
        int expoente = 1;
        double ValorReal;
        Matematica m = new Matematica();

        ValorReal = m.Exponenciacao(base, expoente);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }

    @Test
    public void CalculaPotenciaZero() {
        double ValorEsperado = 1.0;
        double base = 2.0;
        int expoente = 0;
        double ValorReal;
        Matematica m = new Matematica();

        ValorReal = m.Exponenciacao(base, expoente);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }


    @Test
    public void CalculaPotenciaNegativa() {
        double ValorEsperado = 0.25;
        double base = 2.0;
        int expoente = -2;
        double ValorReal;
        Matematica m = new Matematica();

        ValorReal = m.Exponenciacao(base, expoente);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }

    @Test
    public void CalculaDeltaZero(){
        double entradaA ,entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -2.0;
        entradaC = 1.0;
        double ValorEsperado = 0.0;
        double ValorReal;

        Matematica m = new Matematica();
        ValorReal = m.CalculaDelta(entradaA, entradaB, entradaC);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }


    @Test
    public void CalculaDeltaPositivo(){
        double entradaA ,entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -1.0;
        entradaC = -2.0;
        double ValorEsperado = 9.0;
        double ValorReal;

        Matematica m = new Matematica();
        ValorReal = m.CalculaDelta(entradaA, entradaB, entradaC);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }

    @Test
    public void CalculaDeltaNegativo(){
        double entradaA ,entradaB, entradaC;
        entradaA = 2.0;
        entradaB = 3.0;
        entradaC = 4.0;
        double ValorEsperado = -23.0;
        double ValorReal;

        Matematica m = new Matematica();
        ValorReal = m.CalculaDelta(entradaA, entradaB, entradaC);

        assertEquals(ValorEsperado, ValorReal, 0.01);
    }

    @Test
    public void CalculaRaizDeltaZero(){
        double entradaA ,entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -2.0;
        entradaC = 1.0;
        double[] ValorEsperado = new double[]{1.0, 1.0};
        double[] ValorReal;

        Matematica m = new Matematica();
        ValorReal = m.CalculaRaizesEq2Grau(entradaA, entradaB, entradaC);

        assertArrayEquals(ValorEsperado, ValorReal, 0.01);
    }

    @Test
    public void CalculaRaizDeltaPositivo(){
        double entradaA ,entradaB, entradaC;
        entradaA = 1.0;
        entradaB = -1.0;
        entradaC = -2.0;
        double[] ValorEsperado = new double[]{2.0, -1.0};
        double[] ValorReal;

        Matematica m = new Matematica();
        ValorReal = m.CalculaRaizesEq2Grau(entradaA, entradaB, entradaC);

        assertArrayEquals(ValorEsperado, ValorReal, 0.01);
    }
}
