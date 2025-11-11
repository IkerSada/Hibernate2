package eredua.bean;

import java.io.Serializable;
import java.util.Date;
import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

@Named("Login")  // Debe coincidir exactamente con #{Login.izena}
@SessionScoped
public class LoginBean implements Serializable {
    private String izena;
    private String pasahitza;
    private Date data;
    
    // Constructor corregido
    public LoginBean() {
    }
    
    public String getIzena() {
        return izena;
    }
    
    public void setIzena(String izena) {
        this.izena = izena;
    }
    
    public String getPasahitza() {
        return pasahitza;
    }
    
    public void setPasahitza(String pasahitza) {
        this.pasahitza = pasahitza;
    }
    
    public Date getData() {
        return data;
    }
    
    public void setData(Date data) {
        this.data = data;
    }
    
    public String egiaztatu() {
        if ("pirata".equals(izena)) {
            return "error";
        } else {
            return "ok";
        }
    }
}