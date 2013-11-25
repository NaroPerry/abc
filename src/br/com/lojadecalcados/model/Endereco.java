package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Endereco {
    @Id
    @GeneratedValue
    private int id;
    private String rua;
    private int numero;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String complemento;

    public Endereco() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    

    @Override
    public String toString() {
        return "\nRua: " + rua + ", número: " + numero
                + "\nBairro: " + bairro
                + "\nCidade: " + cidade
                + "\nEstado: " + estado
                + "\nCep: " + cep
                + "\nComplemento: " + complemento;
    }
}
