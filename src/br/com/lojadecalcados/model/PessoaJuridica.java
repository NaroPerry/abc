package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PessoaJuridica extends Pessoa {
    
    private String cnpj;

    public PessoaJuridica() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "CNPJ: " + cnpj;
    }
}
