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

    public void consumirBatata(){ // remove uma unidade do produto, caso não tenha aparece a exceção
        if(this.qtdeBatatas <=0){
            throw new RuntimeException("Não tem batatas sufiecientes no celeiro para consumir!");
        }
        this.qtdeBatatas--;
    }

    public void consumirCenoura(){
        if(this.qtdeCenouras <=0){
            throw new RuntimeException("Não tem cenouras suficientes no celeiro para consumir!");
        }
        this.qtdeCenouras--;
    }

    public void consumirMorango(){
        if(this.qtdeMorangos <=0){
            throw new RuntimeException("Não tem morangos suficientes no celeiro para consumir!");
        }
    }

    public int getEspacoDisponivel(){ // quantidade disponivel no celeiro
        int totalProdutos = this.qtdeBatatas + this.qtdeCenouras + this.qtdeMorangos;
        return this.capacidade - totalProdutos;
    }

    public double getOcupacao(){ // numero decimal com a porcentagem da ocupação no celeiro
        int totalProdutos = this.qtdeBatatas + this.qtdeCenouras + this.qtdeMorangos;
        return ((double) totalProdutos / this.capacidade) * 100.0;
    }

    public boolean celeiroCheio(){ // retorna verdadeiro caso o celeiro esteja completamente ocupado
        return getEspacoDisponivel() <= 0;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getQtdeBatatas() {
        return qtdeBatatas;
    }

    public int getQtdeCenouras() {
        return qtdeCenouras;
    }

    public int getQtdeMorangos() {
        return qtdeMorangos;
    }

    







}
