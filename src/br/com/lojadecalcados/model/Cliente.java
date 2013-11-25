package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Cliente extends PessoaFisica {

    @Id
    @GeneratedValue
    private int id;
    private String profissao;
    private String nomeTrabalho;

    public Cliente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNomeTrabalho() {
        return nomeTrabalho;
    }

    public void setNomeTrabalho(String nomeTrabalho) {
        this.nomeTrabalho = nomeTrabalho;
    }

    @Override
    public String toString() {
        return "Cliente: " + nome
                + "Data de nascimento: " + dataNascimento
                + "\nTelefone: " + foneContato
                + "\nEndereço: " + endereco.toString();
    }
}
