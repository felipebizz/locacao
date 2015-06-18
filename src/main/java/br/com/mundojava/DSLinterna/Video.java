package br.com.mundojava.DSLinterna;

/**
 * Created by felipe on 17/06/15.
 */
public class Video {

    private String nome;
    private String nomeOriginal;
    private String genero;
    private String elenco;
    private String sinopse;


    public Video(String nome) {
        this.nome = nome;
    }

    public Video nomeOriginal(String nome) {
        this.nomeOriginal = nome;
        return this;
    }

    public Video doGenero(String genero) {
        this.genero = genero;
        return this;
    }

    public Video com(String elenco) {
        this.elenco = elenco;
        return this;
    }

    public Video pequenoResumo(String resumo) {
        this.sinopse = resumo;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getNomeOriginal() {
        return nomeOriginal;
    }

    public String getGenero() {
        return genero;
    }
}
