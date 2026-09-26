package br.com.joaocarloslima;

public class Batata {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Batata (){
        this.tamanho = 1;
        this.tempoDeVida = 1;
        this.tempoDeCrescimento = 3;
    }

    public void crescer(){  //incrementa o tempo de vida da planta e verifica se o tamanho deve ser incrementado dependendo do tempo de crescimento
        this.tempoDeVida++;
        if (this.tempoDeVida % this.tempoDeCrescimento == 0 && this.tamanho < 4){
            this.tamanho++;
        }
    }

        public boolean podeColher(){ //retorna verdadeiro se o alcançou o tamanho máximo
            return this.tamanho >= 4;
        }

        public String getImagem(){ // imagem da batata em crescimento
            return "images/batata" + this.tamanho + ".png";
        }

        public int getTamanho() {
            return tamanho;
        }

        public int getTempoDeVida() {
            return tempoDeVida;
        }

        public int getTempoDeCrescimento() {
            return tempoDeCrescimento;
        }
    }

