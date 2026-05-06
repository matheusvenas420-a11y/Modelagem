package com.mycompany.model;

import java.util.ArrayList;

public class Atendente extends Funcionario{
    private String turno;
    private ArrayList<OrdemServico> servico;

    public Atendente(String turno, double salario, String nome, String cpf, String telefone) {
        super(salario, nome, cpf, telefone);
        this.turno = turno;
        this.servico = new ArrayList<>();
    }
    
    public void addOS(OrdemServico s){
        servico.add(s);
    }
    public void removeOS(int posicaoOS){
        if(posicaoOS >= 0 && posicaoOS < servico.size()){
            servico.remove(posicaoOS);
        }else{
            System.out.println("Posicao invalida!");
        }
    }
    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
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