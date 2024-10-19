package br.com.screenmatch.principal;

import br.com.screenmatch.calculos.CalculadoraDeTempo;
import br.com.screenmatch.calculos.FiltroRecomendacao;
import br.com.screenmatch.modelos.Episodio;
import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interstellar", 2014);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliações());
        System.out.println(meuFilme.pegaMedia());

        Serie minhaSerie = new Serie("Two and a Half Men", 2002);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(12);
        minhaSerie.setEpisodiosPorTemporada(22);
        minhaSerie.setMinutosPorEpisodio(22);
        System.out.println("Duração para maratonar: " + minhaSerie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Vingadores", 2019);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizações(300);
        filtro.filtra(episodio);

        var maisUmFilme = new Filme("Homem de ferro", 2008);
        maisUmFilme.setDuracaoEmMinutos(120);
        maisUmFilme.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(maisUmFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(maisUmFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("toString do filme " + listaDeFilmes.get(0).toString());

    }
}