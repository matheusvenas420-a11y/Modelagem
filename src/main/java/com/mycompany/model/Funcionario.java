package com.mycompany.model;

public class Funcionario extends Pessoa{
    protected double salario;

    public Funcionario(double salario, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.salario = salario;
    }
    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }    
}
