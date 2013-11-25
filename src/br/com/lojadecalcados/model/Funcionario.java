package br.com.lojadecalcados.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario extends PessoaFisica {
    @Id
    @GeneratedValue
    private int id;
    private double salario;
    private String cargo;
    private String carteiraTrabalho;
    private String login;
    private String senha;

    public Funcionario() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }

    public String getFoneContato() {
        return foneContato;
    }

    public void setFoneContato(String foneContato) {
        this.foneContato = foneContato;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "\nSalário: " + salario
                + "\nCargo: " + cargo
                + "\nCarteira de trabalho: " + carteiraTrabalho
                + "\nTelefone: " + foneContato
                + "\nEndereco: " + endereco.toString();
    }
}
