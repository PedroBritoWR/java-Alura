import br.com.pedrinhodev.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.pedrinhodev.screenmatch.modelos.calculos.FiltroRecomendacao;
import br.com.pedrinhodev.screenmatch.modelos.modelos.Episodio;
import br.com.pedrinhodev.screenmatch.modelos.modelos.Filme;
import br.com.pedrinhodev.screenmatch.modelos.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibirFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        System.out.println("duração do filme " + meuFilme.getDuracaoEmMinutos());

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("lost final ruim");
        lost.setAnoDeLancamento(2009);
        lost.exibirFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemṕrada(24);
        System.out.println("duração da maratonar a merda que eh lost: " + lost.getDuracaoEmMinutos());
        Filme filme2 = new Filme();
        filme2.setNome("avatar");
        filme2.setAnoDeLancamento(2023);
        filme2.setDuracaoEmMinutos(200);
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(filme2);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtrar(episodio);

        var filmeDoPaulo = new Filme();
        filmeDoPaulo.setNome("Daredevil");
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.setAnoDeLancamento(2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filme2);
        System.out.println("tamanho da lista é: " + listaDeFilmes.size());
        System.out.println("O primeiro filme da lista é: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);

    }
}