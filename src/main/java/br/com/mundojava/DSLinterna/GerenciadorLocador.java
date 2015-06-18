package br.com.mundojava.DSLinterna;

/**
 * Created by felipe on 17/06/15.
 */
public class GerenciadorLocador {

    public static void imprimir(Locacao suaLocacao) {
        System.out.println("Nome :" + suaLocacao.getCliente().getNome());

        for (Video video : suaLocacao.getRelacacaoVideo()) {
            System.out.println(video.getNome() + " - " + video.getGenero());
        }

        System.out.println("Total : R$" + suaLocacao.getTotal());
        System.out.println("Total : R$" + suaLocacao.getDataDevolucao());
        System.out.println("Assinatura :____________________");
    }
}
