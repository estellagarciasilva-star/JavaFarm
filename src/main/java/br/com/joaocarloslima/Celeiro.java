package br.com.joaocarloslima;

public class Celeiro {
    private int capacidade;
    private int qtdeBatatas;
    private int qtdeCenouras;
    private int qtdeMorangos;

    public Celeiro (int capacidade){
        this.capacidade = capacidade;
        this.qtdeBatatas = 1;
        this.qtdeCenouras = 1;
        this.qtdeMorangos = 1;   
    }

    public void armazenarBatata(){
        if (celeiroCheio()){
            throw new RuntimeException("O celeiro está cheio!");
        }
        this.qtdeBatatas += 2; // cada vez que colhe, adiciona duas unidades ao celeiro
    }

    public void armazenarCenoura(){
        if(celeiroCheio()){
            throw new RuntimeException("O celeiro está cheio!");
        }
        this.qtdeCenouras += 2;
    }

    public void armazenarMorango(){
        if(celeiroCheio()){
            throw new RuntimeException("O celeiro está cheio!");
        }
        this.qtdeMorangos +=2;
    }



}
