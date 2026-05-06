package com.mycompany.model;

import java.util.ArrayList;

public class Servico {

    private static int count;
    private int id;

    private String descricao;
    private int tempoPrevisto;
    private int tempoReal;
    private double valorUnitario;
    private Mecanico mecanico;
    private ArrayList<Veiculo> veiculo;
    private ArrayList<Pecas> pecasUsadas;

    public Servico(String descricao, int tempoPrevisto, double valorUnitario) {
        count++;
        this.id = count;
        this.descricao = descricao;
        this.tempoPrevisto = tempoPrevisto;
        this.valorUnitario = valorUnitario;
        this.tempoReal = 0;
        this.pecasUsadas = new ArrayList<>();
        this.veiculo = new ArrayList<>();
    }
    public double calcularValorPecas(){
        double valordaPecas = 0;
        for (int i = 0; i < pecasUsadas.size(); i++) {
            valordaPecas += pecasUsadas.get(i).getValorPeca();
        }
        return valordaPecas;
    }
    public void addVeiculo(Veiculo v){
        this.veiculo.add(v);
    }
    public void listarVeiculo() {
        if (veiculo.isEmpty()) {
            System.out.println("Nenhuma peca adicionada");
            return;
        }

        for (int i = 0; i < veiculo.size(); i++) {
            System.out.println("Posicao: " + i + " | Peca: " + veiculo.get(i));
        }
    }
    public void removerVeiculo(int posicao) {
        if (posicao < 0 || posicao >= veiculo.size()) {
            System.out.println("Posição inválida.");
        }

        veiculo.remove(posicao);
        System.out.println("Veiculo removido com sucesso.");
    }
    public void addPecas(Pecas p){
        this.pecasUsadas.add(p);
    }
    public void listarPecas() {
        if (pecasUsadas.isEmpty()) {
            System.out.println("Nenhuma peca adicionada");
        }

        for (int i = 0; i < pecasUsadas.size(); i++) {
            System.out.println("Posicao: " + i + " | Peca: " + pecasUsadas.get(i));
        }
    }
    public void removerPeca(int posicao){
        if (posicao < 0 || posicao >= pecasUsadas.size()) {
            System.out.println("Posição inválida.");
        }

        pecasUsadas.remove(posicao);
        System.out.println("Peça removida com sucesso.");
    }
    public Mecanico getMecanico() {
        return mecanico;
    }

    public void setMecanico(Mecanico mecanico) {
        this.mecanico = mecanico;
    }
    
    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getTempoPrevisto() {
        return tempoPrevisto;
    }

    public void setTempoPrevisto(int tempoPrevisto) {
        this.tempoPrevisto = tempoPrevisto;
    }

    public int getTempoReal() {
        return tempoReal;
    }

    public void setTempoReal(int tempoReal) {
        this.tempoReal = tempoReal;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }
    
    public double getValoresServicos(){
        double total = 0;
        for (int i = 0; i < pecasUsadas.size(); i++) {
            total += pecasUsadas.get(i).getValorPeca();
        }
        return total + valorUnitario;
    }
    
    public String getInfo() {
        double valorTotalPecas = 0;
        String relatorio =
               "\n===== SERVICOS =====" + 
               "\n----------------------------------------" + 
               "\n | ID: " + id +
               "\n | Servico: " + descricao +
               "\n | Tempo Previsto: " + tempoPrevisto +
               "\n | Tempo Real: " + tempoReal +
               "\n | Valor Servico: R$ " + valorUnitario;
        for (int i = 0; i < veiculo.size(); i++) {
            relatorio += "\n | Veiculo Placa: " + veiculo.get(i).getPlaca();
        }
        
        relatorio += "\n----------------------------------------" + 
               "\n===== MECANICO =====" +
               "\nID Mecanico: " + mecanico.getId() +
               "\n Nome Mecanico: "+ mecanico.getNome() +
               "\nEspecialidade: " + mecanico.getEspecialidade() + 
               "\n----------------------------------------";
        if(pecasUsadas.isEmpty()){
            relatorio += "\n" + "===== PECAS =====" + 
                         "\n" + "NAO FORAM ADICIONADAS PECAS NESTE SERVICO" + 
                         "\n----------------------------------------";
        }else{
            for (int i = 0; i < pecasUsadas.size(); i++) {
                valorTotalPecas += pecasUsadas.get(i).getValorPeca();
                relatorio += "\n" + "===== PECAS =====" +
                         "\n" + "ID Peca: " + pecasUsadas.get(i).getId() + 
                         "\n" + "Nome Peca" + pecasUsadas.get(i).getNomePeca() + 
                         "\n" + "Valor da Peca R$ " + pecasUsadas.get(i).getValorPeca() + 
                         "\n----------------------------------------";
            }
        }
        relatorio += "\n" + "===== TOTAL SERVICO ====="  + 
                     "\n" + "Valor total(Pecas + Valor servico) R$ " + (valorTotalPecas + valorUnitario) +
                     "\n----------------------------------------";;
        
        
        return relatorio;
    }
}