package br.com.mundojava.DSLinterna;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by felipe on 17/06/15.
 */
public class Locacao {
    private Cliente cliente;
    private List<Video> relacacaoVideo = new ArrayList<Video>();
    private Date dataDevolucao;
    private boolean pago;

    public Locacao(Cliente cliente) {
        this.cliente = cliente;
    }

    public static Locacao para(Cliente cliente) {
        return new Locacao(cliente);
    }

    public Locacao adicionar(Video... videos) {
        for (Video video : videos) {
            relacacaoVideo.add(video);
        }
        return this;
    }

    public Locacao paraDevolver(Date data) {
        dataDevolucao = data;
        return this;
    }

    public Locacao aPagar() {
        pago = false;
        return this;
    }

    public Locacao jaPago() {
        pago = true;
        return this;
    }

    public String getTotal() {
        if (!pago) {
            int valor = this.relacacaoVideo.size() * 2;
            return valor + ",00";
        } else {
            return "0,00";

        }
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<Video> getRelacacaoVideo() {
        return relacacaoVideo;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
