package com.mycompany.model;

import java.util.ArrayList;

public class Orcamento {
    private static int count;
    private int id;
    
    private ArrayList<Servico> servicos;
    
    private Stats stats;
    
    private enum Stats{
        APROVADO,
        RECUSADO
    }

    public Orcamento() {
        count++;
        this.id = count;
        this.servicos = new ArrayList<>();
        
    }
    public void addServico(Servico s){
        this.servicos.add(s);
    }
 
    public void removerPeca(int posicao) {
        if (posicao < 0 || posicao >= servicos.size()) {
            System.out.println("Posição inválida.");
            return;
        }

        servicos.remove(posicao);
        System.out.println("Peça removida com sucesso.");
    }
    public double getCalculoServicos(){
        double total = 0;
        for (int i = 0; i < servicos.size(); i++) {
            total += servicos.get(i).getValoresServicos();
        }
        return total;
    }
    public void getInfoOrcamento() {
        System.out.println("\n===== ORCAMENTO =====" +
                     "\n" + "STATUS: " + stats + 
                     "\n" + "TOTAL GERAL R$ " + getCalculoServicos());
        for (int i = 0; i < servicos.size(); i++) {
            System.out.println(servicos.get(i).getInfo());
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void aprovar(){
        this.stats = stats.APROVADO;
    }
    public void recusar(){
        this.stats = stats.RECUSADO;
    }
}