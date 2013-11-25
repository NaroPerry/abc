
package br.com.lojadecalcados.controller;

import br.com.lojadecalcados.model.Cliente;
import br.com.lojadecalcados.model.persistencia.ClienteDAOImplements;
import br.com.lojadecalcados.model.persistencia.dao.ClienteDAO;
import java.util.List;


public class ClienteController {
    public int salvar (Cliente c){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.save(c).getId();
    }
    
    public boolean remove (int id){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.remover(Cliente.class, id);
    }
    public List<Cliente> listarTodos(){
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.listarTodos(Cliente.class);
    }
    
     public Cliente listById(int id){
        ClienteDAO dao = new 
                ClienteDAOImplements();
        return dao.buscarCodigo(Cliente.class, id);
    }
    
    public List<Cliente> listByNome(String nome) {
        ClienteDAO dao = new ClienteDAOImplements();
        return dao.listByNome(nome, Cliente.class);
    }
    
}
