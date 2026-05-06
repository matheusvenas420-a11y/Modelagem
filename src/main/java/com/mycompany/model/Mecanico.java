package com.mycompany.model;

public class Mecanico extends Funcionario{
    private static int count;
    private String id;
    protected String especialidade;

    public Mecanico(String especialidade, double salario, String nome, String cpf, String telefone) {
        super(salario, nome, cpf, telefone);
        this.especialidade = especialidade;
        count++;
        this.id = "ME-" + count;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
