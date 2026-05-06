package com.mycompany;

import com.mycompany.model.Cliente;
import com.mycompany.model.Veiculo;
import com.mycompany.model.OrdemServico;
import com.mycompany.model.Servico;
import com.mycompany.model.Mecanico;
import com.mycompany.model.Orcamento;
import com.mycompany.model.Pecas;
import com.mycompany.model.Atendente;

public class TesteClasseOS {

    public static void main(String[] args) {
        Atendente a = new Atendente("Tarde", 2000, "Matheus", "7855845454", "5454654654");
        Cliente  c = new Cliente("Rua B", "Fulano", "75894545451", "1312323");
        Veiculo v = new Veiculo("ABC-6969", "Citroen", "Sedan", 2006, 10000);
        Veiculo v2 = new Veiculo("ADT-5969", "Fusion", "Sedan", 2012, 50000);
        Mecanico m = new Mecanico("Motor", 3000, "Clei", "545465465464321321", "457879874615");
        Mecanico m1 = new Mecanico("Suspensao", 2600, "Bob", "545454545454", "55465478654");
        Servico s = new Servico("Troca de Oleo", 10, 150);
        Servico s2 = new Servico("Troca de Pastilha", 2, 100);
        Pecas p = new Pecas("Filtro de Oleo", 250);
        Pecas p2 = new Pecas("Pastilha", 100);
        
        c.addVeiculo(v);
        v.setCliente(c);
        v2.setCliente(c);
        v.addServicoFeito(s2);
        v.addServicoFeito(s);
        
        s.setMecanico(m);
        s.addPecas(p);
        s.addVeiculo(v);
        s2.setMecanico(m1);
        s2.addPecas(p2);
        s2.addVeiculo(v);
        s2.addVeiculo(v2);
        
        Orcamento orc = new Orcamento();
        orc.aprovar();
        orc.addServico(s);
        orc.addServico(s2);
        
        OrdemServico os = new OrdemServico("Manuntencao");
        os.setCliente(c);
        os.addVeiculo(v);
        os.addVeiculo(v2);
        a.addOS(os);
        os.setOrcamento(orc);
        os.dinheiro();
        os.concluir();
        os.fecharData();
        os.getInfo();
        
        v.servicosFeitos();
        
        
    }
}