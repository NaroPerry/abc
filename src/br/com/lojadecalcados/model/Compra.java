package br.com.lojadecalcados.model;

public class Compra {

    private int idCompra;
    private Produto produtoCompra;
    private double totalCompra;
    private PessoaJuridica fornecedorCompra;
    private Funcionario funcionarioCompra;

    public Compra() {
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public Produto getProdutoCompra() {
        return produtoCompra;
    }

    public void setProdutoCompra(Produto produtoCompra) {
        this.produtoCompra = produtoCompra;
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void setTotalCompra(double totalCompra) {
        this.totalCompra = totalCompra;
    }

    public PessoaJuridica getFornecedorCompra() {
        return fornecedorCompra;
    }

    public void setFornecedorCompra(PessoaJuridica fornecedorCompra) {
        this.fornecedorCompra = fornecedorCompra;
    }

    public Funcionario getFuncionarioCompra() {
        return funcionarioCompra;
    }

    public void setFuncionarioCompra(Funcionario funcionarioCompra) {
        this.funcionarioCompra = funcionarioCompra;
    }

    @Override
    public String toString() {
        return "Código de compra: " + idCompra
                + "Comprador: " + funcionarioCompra.nome
                + "\nEmpresa: " + fornecedorCompra.nome
                + "\nValor total da compra: " + totalCompra;
    }
}
