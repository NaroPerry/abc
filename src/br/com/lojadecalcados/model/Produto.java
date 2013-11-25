package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Produto {
    @Id
    @GeneratedValue
    private int idProduto;
    private String nome;
    private double preco;
    private int numero;
    private String cor;
    @ManyToOne
    private Categoria categoria;

    public Produto() {
    }

    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    

    @Override
    public String toString() {
        return "\nCódigo do produto: " + idProduto
                + "\nNome: " + nome
                + "\nNúmero: " + numero
                + "\nCategoria: " + categoria
                + "\nCor: " + cor;
    }
}
