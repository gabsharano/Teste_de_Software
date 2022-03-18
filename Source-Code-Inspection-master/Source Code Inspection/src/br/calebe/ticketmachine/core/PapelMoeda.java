package br.calebe.ticketmachine.core;

/**
 *
 * @author Calebe de Paula Bianchini
 */

/* OMISSAO - As operacoes "Setters" nao foram implementadas */
public class PapelMoeda {

    /* COMISSAO - A visibilidade das variaveis "valor" e "quantidade" deveria ser "private" */
    protected int valor;
    protected int quantidade;

    public PapelMoeda(int valor, int quantidade) {
        this.valor = valor;
        this.quantidade = quantidade;
    }

    /* OUTROS - Poderia ser utilizado o "this." para facilitar entendimento */
    public int getValor() {
        return valor;
    }

    /* OUTROS - Poderia ser utilizado o "this." para facilitar entendimento */
    public int getQuantidade() {
        return quantidade;
    }
}
