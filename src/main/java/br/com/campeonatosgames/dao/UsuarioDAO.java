package br.com.campeonatosgames.dao;

import br.campeonatosgamer.model.Usuario;
import br.com.campeonatosgamer.util.GenericDAO;

public class UsuarioDAO extends GenericDAO<Usuario> {

    @Override
    public Class<Usuario> getClassType() {
        return Usuario.class;   
    } 
    
}
