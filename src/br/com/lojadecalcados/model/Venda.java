package br.com.lojadecalcados.model;

public class Venda {

    private int idVenda;
    private Produto produtoVenda;
    private double valorVenda;
    private Cliente clienteVenda;
    private Funcionario funcionarioVenda;

    public Venda() {
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Produto getProdutoVenda() {
        return produtoVenda;
    }

    public void setProdutoVenda(Produto produtoVenda) {
        this.produtoVenda = produtoVenda;
    }
    
    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public Cliente getClienteVenda() {
        return clienteVenda;
    }

    public void setClienteVenda(Cliente clienteVenda) {
        this.clienteVenda = clienteVenda;
    }

    public Funcionario getFunconarioVenda() {
        return funcionarioVenda;
    }

    public void setFunconarioVenda(Funcionario funconarioVenda) {
        this.funcionarioVenda = funconarioVenda;
    }

    @Override
    public String toString() {
        return "Código de venda: " + idVenda
                + "Cliente: " + clienteVenda.nome
                + "\nVendedor: " + funcionarioVenda.nome
                + "\nTotal a pagar: " + valorVenda;
    }
}
