package com.example.bhaskara;

public class Matematica {

    public double Exponenciacao(double base, int expoente){
        double resultado;
        int potencia;

        if (expoente == 0) return 1.0;

        resultado = base;
        potencia = expoente;
         if (expoente < 0) potencia *= -1;

            resultado = base;
            for (int i = 2; i <= potencia; i++) {
                resultado *= base;
            }
            if (expoente < 0) resultado = 1.0/ resultado;

        return resultado;
    }

    public double CalculaDelta(double a, double b, double c){
        //resultado = Math.pow(b, 2) -4 * a *c;
        double resultado;
        resultado = Exponenciacao(b, 2) - 4 * a * c;
        return resultado;
    }

    public double[] CalculaRaizesEq2Grau(double a, double b, double c) {
        double delta = CalculaDelta(a, b, c);
        double[] raizes = null;

        if (delta >= 0){
            raizes = new double[2];
            raizes[0] = (-b + Math.sqrt(delta)) / (2*a);

            if (delta>0)
            raizes[1] = (-b - Math.sqrt(delta)) / (2*a);

            else
            raizes[1] = raizes[0];
        }

        return  raizes;
    }
}
