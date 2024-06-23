package com.aluracursos.screenmatch.modelos;

public class Serie extends Titulo{
    private int temporadas;
    private int episodisoPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodisoPorTemporada() {
        return episodisoPorTemporada;
    }

    public void setEpisodisoPorTemporada(int episodisoPorTemporada) {
        this.episodisoPorTemporada = episodisoPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracionEnMinutos(){
        return temporadas * episodisoPorTemporada * minutosPorEpisodio;
    }
}
