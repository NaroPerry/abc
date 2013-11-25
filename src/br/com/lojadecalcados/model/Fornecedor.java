package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Fornecedor extends PessoaJuridica {
    @Id
    @GeneratedValue
    private int id;
    private String descricao;

    public Fornecedor() {
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
