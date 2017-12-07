package br.com.campeonatosgames.dao;

import br.campeonatosgamer.model.Login;
import br.com.campeonatosgamer.util.GenericDAO;


public class LoginDAO extends GenericDAO<Login>{

    @Override
    public Class<Login> getClassType() {
       return Login.class;
    }
    
}
