package br.com.dio.aulas.interfaces;

public class Calculadora implements OperacaoMatematica {

    @Override
    public double soma(double numero1, double numero2) {
        // TODO Auto-generated method stub
        return numero1 + numero2;
    }

    @Override
    public double subtracao(double numero1, double numero2) {
        // TODO Auto-generated method stub
        return numero1 - numero2;
    }

    @Override
    public double multiplicacao(double numero1, double numero2) {
        // TODO Auto-generated method stub
        return numero1 * numero2;
    }

    @Override
    public double divisao(double numero1, double numero2) {
        // TODO Auto-generated method stub
        return numero1 / numero2;
    }
    
}
