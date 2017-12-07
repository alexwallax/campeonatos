package br.com.campeonatosgames.controller;

import br.campeonatosgamer.model.Login;
import br.com.campeonatosgames.dao.LoginDAO;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ViewScoped
@ManagedBean(name = "loginBean")
public class LoginBean {
    
    private Login login = new Login();
    
    public void salvar() {
        LoginDAO dao = new LoginDAO();
        if (this.login.getId() == 0) {
            dao.insert(login);
        } else {
            dao.update(login);
        }
        this.login = new Login();
    }
    public void editar(Login login){
        this.login = login;
    }
    public void remover(Login login) {
        LoginDAO dao = new LoginDAO();
        dao.delete(login);
    }
    public List<Login> getLogins() {
        LoginDAO dao = new LoginDAO();
        return dao.selectAll();
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }
}





















