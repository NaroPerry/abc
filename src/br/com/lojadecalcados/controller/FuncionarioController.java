
package br.com.lojadecalcados.controller;

import br.com.lojadecalcados.model.Funcionario;
import br.com.lojadecalcados.model.persistencia.FuncionarioDAOImplements;
import br.com.lojadecalcados.model.persistencia.dao.FuncionarioDAO;
import java.util.List;


public class FuncionarioController {
    
    public int salvar (Funcionario f){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.save(f).getId();
    }
    
    public boolean remove (int id){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.remover(Funcionario.class, id);
    }
    public List<Funcionario> listarTodos(){
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listarTodos(Funcionario.class);
    }
    
     public Funcionario listById(int id){
        FuncionarioDAO dao = new 
                FuncionarioDAOImplements();
        return dao.buscarCodigo(Funcionario.class, id);
    }
    
    public List<Funcionario> listByNome(String nome) {
        FuncionarioDAO dao = new FuncionarioDAOImplements();
        return dao.listByNome(nome, Funcionario.class);
    }
    
}
