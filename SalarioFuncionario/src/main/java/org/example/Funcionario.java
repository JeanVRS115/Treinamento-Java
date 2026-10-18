package org.example;
public class Funcionario {

    String nome;
    Double salarioBruto;
    Double imposto;

    public double salarioLiquido() {
        return salarioBruto - imposto;
    }

    public void aumentarSalarioBruto(double porcentagem) {
        salarioBruto += salarioBruto * porcentagem / 100.0;
    }

    public String toString(){
        return nome
                +", "
                + "R$"
                +String.format("%.2f", salarioLiquido());

    }

}

