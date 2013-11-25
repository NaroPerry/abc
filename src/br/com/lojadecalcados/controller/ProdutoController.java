
package br.com.lojadecalcados.controller;

import br.com.lojadecalcados.model.Produto;
import br.com.lojadecalcados.model.persistencia.ProdutoDAOImplements;
import br.com.lojadecalcados.model.persistencia.dao.ProdutoDAO;
import java.util.List;


public class ProdutoController {
    
    public int salvar (Produto f){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.save(f).getIdProduto();
    }
    
    public boolean remove (int id){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.remover(Produto.class, id);
    }
    public List<Produto> listarTodos(){
        ProdutoDAO dao = new ProdutoDAOImplements();
        return dao.listarTodos(Produto.class);
    }
    
     public Produto listById(int id){
        ProdutoDAO dao = new 
                ProdutoDAOImplements();
        return dao.buscarCodigo(Produto.class, id);
    }
    
//    public List<Produto> listByNome(String nome){
//        ProdutoDAO dao = new ProdutoDAOImplements();
//        return dao.listarPorNome();
//    }
    
}
