package br.com.joaocarloslima;

import java.util.ArrayList;
import java.util.List;

public class Fazenda {

    private List<Terreno> terrenos;
    private Celeiro celeiro;

    public Fazenda() {
        this.terrenos = new ArrayList<>();
        this.celeiro = new Celeiro(20);

        for (int x = 0; x < 13; x++) {
            for (int y = 0; y < 13; y++) {
                terrenos.add(new Terreno(x, y));
            }
        }
    }

    public Terreno getTerreno(int x, int y) {
        for (Terreno terreno : terrenos) {
            if (terreno.getX() == x && terreno.getY() == y) {
                return terreno;
            }
        }
        return null;
    }

    public void plantarBatata(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if (terreno.estaOcupado()) {
            throw new RuntimeException("Esse terreno já está ocupado!");
        }

        terreno.plantar(new Batata());
        celeiro.consumirBatata();
    }

    public void plantarCenoura(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if (terreno.estaOcupado()) {
            throw new RuntimeException("Esse terreno já está ocupado!");
        }

        terreno.plantar(new Cenoura());
        celeiro.consumirCenoura();
    }

    public void plantarMorango(int x, int y) {
        Terreno terreno = getTerreno(x, y);

        if (terreno.estaOcupado()) {
            throw new RuntimeException("Esse terreno já está ocupado!");
        }

        terreno.plantar(new Morango());
        celeiro.consumirMorango();
    }

    public void colher(int x, int y) {
        Terreno terreno = getTerreno(x, y);
        terreno.colher(celeiro);
    }

    public Celeiro getCeleiro() {
        return celeiro;
    }
}