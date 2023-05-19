package com.mycompany.aula05;
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(590728);
        p1.setDono("Jubila");
        p1.abrirConta("CC");
        
        
        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(4458);
        p2.setDono("Creuza");
        p2.abrirConta("CP");
        
        
        p1.depositar(100);
        p2.depositar(500);
        
        p1.sacar(150);
        p1.fecharConta();
        
        
        
        
        p1.estadoAtual();
        p2.estadoAtual();
    }
}
