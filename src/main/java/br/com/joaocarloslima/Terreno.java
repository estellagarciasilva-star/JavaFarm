package br.com.joaocarloslima;

public class Terreno {
    private int x;
    private int y;
    
    private Batata batata;
    private Cenoura cenoura;
    private Morango morango;

    public Terreno(int x, int y) {
        this.x = x;
        this.y = y;
        this.batata = null;
        this.cenoura = null;
        this.morango = null;
    }

    public void plantar(Batata batata) {
        if (estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        this.batata = batata;
    }

    public void plantar(Cenoura cenoura) {
        if (estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        this.cenoura = cenoura;
    }

    public void plantar(Morango morango) {
        if (estaOcupado()) {
            throw new RuntimeException("O terreno já está ocupado!");
        }
        this.morango = morango;
    }

    public boolean estaOcupado() {
        return this.batata != null || this.cenoura != null || this.morango != null;
    }

    //faz a planta que está no terreno crescer um ciclo
    public void crescer() {
        if (this.batata != null) {
            this.batata.crescer();
        } else if (this.cenoura != null) {
            this.cenoura.crescer();
        } else if (this.morango != null) {
            this.morango.crescer();
        }
    }
    //tenta colher o produto e enviá-lo para o celeiro
    public void colher(Celeiro celeiro) {
        if (!estaOcupado()) {
            throw new RuntimeException("Não há nada para colher neste terreno!");
        }

        if (this.batata != null) {
            if (this.batata.podeColher()) {
                celeiro.armazenarBatata();
                this.batata = null; // Liberta o terreno
            } else {
                throw new RuntimeException("A batata ainda não está pronta para colher!");
            }
        } else if (this.cenoura != null) {
            if (this.cenoura.podeColher()) {
                celeiro.armazenarCenoura();
                this.cenoura = null;
            } else {
                throw new RuntimeException("A cenoura ainda não está pronta para colher!");
            }
        } else if (this.morango != null) {
            if (this.morango.podeColher()) {
                celeiro.armazenarMorango();
                this.morango = null;
            } else {
                throw new RuntimeException("O morango ainda não está pronto para colher!");
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Batata getBatata() {
        return batata;
    }

    public Cenoura getCenoura() {
        return cenoura;
    }

    public Morango getMorango() {
        return morango;
    }
}

