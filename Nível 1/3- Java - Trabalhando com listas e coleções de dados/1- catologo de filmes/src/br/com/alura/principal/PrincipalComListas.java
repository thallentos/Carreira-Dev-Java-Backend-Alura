package br.com.alura.principal;

import java.util.ArrayList;
import java.util.Collections;

import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;
import br.com.alura.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Star Wars Episodio III - A Vingança dos Sith", 2005);
        meuFilme.avalia(8.5);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(7.5);        
        var filmeDoThallentos = new Filme("O Amor É Cego", 2003);
        filmeDoThallentos.avalia(8.0);
        Serie lost = new Serie("Lost", 2004);
        lost.avalia(9.0);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoThallentos);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista){ 
            System.out.println(item.getNome());
            if (item instanceof Filme filme) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Dwayne Johnson");
        
        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);
        System.out.println("Lista de filmes e séries ordenada por nome: ");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
