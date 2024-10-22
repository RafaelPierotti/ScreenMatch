package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;
import br.com.screenmatch.modelos.Titulo;

import javax.sound.midi.Soundbank;
import javax.xml.transform.sax.SAXSource;
import java.util.*;

public class MainComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interstellar", 2014);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Vingadores Ultimato", 2019);
        outroFilme.avalia(6);
        var maisUmFilme = new Filme("Homem de ferro", 2008);
        maisUmFilme.avalia(10);
        Serie minhaSerie = new Serie("Two and a Half Men", 2002);

        Filme f1 = maisUmFilme;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisUmFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(minhaSerie);

        for (Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Charlie Sheen");
        buscaPorArtista.add("Robert Downey JR");
        buscaPorArtista.add("Rafael");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por anos");
        System.out.println(lista);
    }
}
