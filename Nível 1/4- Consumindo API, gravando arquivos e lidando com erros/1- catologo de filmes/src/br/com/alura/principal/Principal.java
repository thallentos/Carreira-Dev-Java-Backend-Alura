package br.com.alura.principal;
import java.util.ArrayList;

import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars Episodio III - A Vingança dos Sith", 2005);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica(); 
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        System.out.println("Média das avaliações: " + meuFilme.retornaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie supernatural = new Serie("Supernatural", 2005);
        supernatural.setDuracaoEmMinutos(50);
        supernatural.exibeFichaTecnica();
        supernatural.setTemporadas(15);
        supernatural.setEpisodiosPorTemporada(20);
        supernatural.setMinutosPorEpisodio(45);
        System.out.println("Duração em minutos: " + supernatural.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        var filmeDoThallentos = new Filme("O Amor É Cego", 2003);
        filmeDoThallentos.setDuracaoEmMinutos(200);
        filmeDoThallentos.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoThallentos);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("Segundo filme da lista: " + listaDeFilmes.get(1).getNome());
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());
        

    }
}
