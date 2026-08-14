import br.com.alura.calculos.CalculadoraDeTempo;
import br.com.alura.calculos.FiltroRecomendacao;
import br.com.alura.modelos.Filme;
import br.com.alura.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("Star Wars Episodio III - A Vingança dos Sith");
        meuFilme.setAnoDeLancamento(2005);
        meuFilme.setDuracaoEmMinutos(140);

        meuFilme.exibeFichaTecnica(); 
        meuFilme.avalia(8.5);
        meuFilme.avalia(9.0);
        System.out.println("Média das avaliações: " + meuFilme.retornaMedia());
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        Serie supernatural = new Serie();
        supernatural.setNome("Supernatural");
        supernatural.setAnoDeLancamento(2005);
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
    }
}
