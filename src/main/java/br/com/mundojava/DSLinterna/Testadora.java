package br.com.mundojava.DSLinterna;

import static br.com.mundojava.DSLinterna.DataUtil.DOIS_DIAS;
import static br.com.mundojava.DSLinterna.DataUtil.daquiA;

/**
 * Created by felipe on 17/06/15.
 */
public class Testadora {

    public static void main(String args[]) {

        Cliente paulo = new Cliente("Paulo", "32251081890");
        Locacao locacao = Locacao.para(paulo);

        Video tropaDeElite = new Video("Tropa de Elite");
        tropaDeElite.nomeOriginal("Tropa de Elite")
                .doGenero("ação/crime/drama")
                .com("Wagner Moura, Caio Junqueira ..")
                .pequenoResumo("Filme que retrata o trabalho do BOPE.");

        Video simpsons = new Video("Os Simpsons");
        simpsons.nomeOriginal("The Simpsons")
                .doGenero("ação/comedia")
                .com("Homer, Bart, Meg, Lisa..")
                .pequenoResumo("Filme que retrata o cidade de springField");

        locacao.adicionar(tropaDeElite, simpsons).paraDevolver(daquiA(DOIS_DIAS)).aPagar();

        GerenciadorLocador.imprimir(locacao);

    }
}
