package com.mycompany.model;

import java.util.ArrayList;

public class Cliente extends Pessoa{
    private String endereco;
    private ArrayList<Veiculo> veiculos;

    public Cliente(String endereco, String nome, String cpf, String telefone) {
        super(nome, cpf, telefone);
        this.endereco = endereco;
        this.veiculos = new ArrayList<>();
    }
    public void addVeiculo(Veiculo v) {
        this.veiculos.add(v);
    }
    public void removerVeiculo(int posicao) {
        if (posicao >= 0 && posicao < veiculos.size()) {
            veiculos.remove(posicao);
        } else {
            System.out.println("Posicao invalida");
        }
    }
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public String getInfoCliente(){
        String info = "===== CLIENTE =====\n";
        info += "Nome: " + this.getNome() + "\n";
        info += "Cpf: " + this.getCpf() + "\n";
        info += "Telefone: " + this.getTelefone() + "\n";
        if(endereco != null){
            info += "Endereco: " + this.getEndereco() + "\n";
        }else{
            info += "Endereco: Nao Infomado" + "\n";
        }
        info += "\n----------------------------------------";
        return info;
    }
}
