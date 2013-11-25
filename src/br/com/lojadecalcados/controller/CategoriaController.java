/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.lojadecalcados.controller;

import br.com.lojadecalcados.model.Categoria;
import br.com.lojadecalcados.model.persistencia.CategoriaDAOImplements;
import br.com.lojadecalcados.model.persistencia.dao.CategoriaDAO;
import java.util.List;

/**
 *
 * @author guest01
 */
public class CategoriaController {
    
    public int salve(Categoria c){
        CategoriaDAO dao = new CategoriaDAOImplements();
        return dao.save(c).getId();
    }
    
    public List<Categoria> listAll(){
        CategoriaDAO dao = new CategoriaDAOImplements();
        return dao.listarTodos(Categoria.class);
    }
    
    public boolean remove (int id){
        CategoriaDAO dao = new CategoriaDAOImplements();
        return dao.remover(Categoria.class, id);
    }
    
    public Categoria listarId(int id){
        CategoriaDAO dao = new CategoriaDAOImplements();
        return dao.buscarCodigo(Categoria.class, id);
    }
    
}
