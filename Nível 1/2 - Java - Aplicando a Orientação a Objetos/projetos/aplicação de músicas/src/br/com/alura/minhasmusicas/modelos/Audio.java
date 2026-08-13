package br.com.alura.minhasmusicas.modelos;

public class Audio {
    private String titulo;
    private int totalDeReproducoes;
    private int totalCurtidas;
    private int classificacao;

    public void curtir(){
        this.totalCurtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }   
}
