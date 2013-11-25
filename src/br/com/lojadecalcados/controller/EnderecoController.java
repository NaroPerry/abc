
package br.com.lojadecalcados.controller;

import br.com.lojadecalcados.model.Endereco;
import br.com.lojadecalcados.model.persistencia.EnderecoDAOImplements;
import br.com.lojadecalcados.model.persistencia.dao.EnderecoDAO;
import java.util.List;


public class EnderecoController {
    
    public int salvar(Endereco e){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.save(e).getId();
    }
     public boolean remove (int id){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.remover(Endereco.class, id);
    }
    public List<Endereco> listarTodos(){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.listarTodos(Endereco.class);
    }
    
     public Endereco listById(int id){
        EnderecoDAO dao = new EnderecoDAOImplements();
        return dao.buscarCodigo(Endereco.class, id);
    }
    
}
