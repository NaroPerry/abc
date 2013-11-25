package br.com.lojadecalcados.model;

public class Transportadora extends PessoaJuridica {

    private String descricao;

    public Transportadora() {
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Descrição: " + descricao;
    }
}
