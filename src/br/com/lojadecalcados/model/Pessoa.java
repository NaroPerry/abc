package br.com.lojadecalcados.model;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class Pessoa {
    
    protected String nome;
    @Temporal(TemporalType.DATE)
    protected Date dataNascimento;
    protected String foneContato;
    protected String sexo;
    @OneToOne
    protected Endereco endereco;

    public Pessoa() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getFoneContato() {
        return foneContato;
    }

    public void setFoneContato(String foneContato) {
        this.foneContato = foneContato;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return 
                 "\nNome: " + nome
                + "\nData de nascimento: " + dataNascimento
                + "\nTelefone: " + foneContato
                + "\nEndereço: " + endereco.toString();
    }
}
