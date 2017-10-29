package br.com.campeonatosgames.dao;

import br.campeonatosgamer.model.Cadastro;
import br.com.campeonatosgamer.util.GenericDAO;

public class CadastroDAO extends GenericDAO<Cadastro> {
    
    @Override
    public Class<Cadastro> getClassType() {
        return Cadastro.class;
    }  
    
}
