package com.mycompany.model;

public class Pecas {
    private static int count;
    private int id;
    
    private String nomePeca;
    private double valorPeca;

    public Pecas(String nomePeca, double valorPeca) {
        this.nomePeca = nomePeca;
        this.valorPeca = valorPeca;
        
        count++;
        this.id = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNomePeca() {
        return nomePeca;
    }

    public void setNomePeca(String nomePeca) {
        this.nomePeca = nomePeca;
    }

    public double getValorPeca() {
        return valorPeca;
    }

    public void setValorPeca(double valorPeca) {
        this.valorPeca = valorPeca;
    }
    
}
