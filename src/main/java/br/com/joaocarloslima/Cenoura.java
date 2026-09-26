package br.com.joaocarloslima;

public class Cenoura {
    private int tamanho;
    private int tempoDeVida;
    private int tempoDeCrescimento;

    public Cenoura() {
        this.tamanho = 1;
        this.tempoDeVida = 0;
        this.tempoDeCrescimento = 3;
    }

    public void crescer() {
        tempoDeVida++;

        if (tempoDeVida % tempoDeCrescimento == 0 && tamanho < 4) {
            tamanho++;
        }
    }

    public boolean podeColher() {
        return tamanho == 4;
    }

    public String getImagem() {
        return "images/cenoura" + tamanho + ".png";
    }
}
