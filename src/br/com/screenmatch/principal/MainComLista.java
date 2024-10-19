package br.com.screenmatch.principal;

import br.com.screenmatch.modelos.Filme;
import br.com.screenmatch.modelos.Serie;

public class MainComLista {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Interstellar", 2014);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Vingadores Ultimato", 2019);
        outroFilme.avalia(6);
        var maisUmFilme = new Filme("Homem de ferro", 2008);
        maisUmFilme.avalia(10);
        Serie minhaSerie = new Serie("Two and a Half Men", 2002);


    }
}
