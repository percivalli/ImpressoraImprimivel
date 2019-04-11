package br.com.digitalhouse;

import java.util.ArrayList;

public class Impressora {
    ArrayList<Imprimivel> imprimiveis = new ArrayList<Imprimivel>();

    public void adicionarImprimivel(Imprimivel umImprimivel) {
        this.imprimiveis.add(umImprimivel);
    }

    public void imprimirTudo(){
        for (int i = 0; i < this.imprimiveis.size(); i++){
        this.imprimiveis.get(i).imprimir();}
    }
}
