package com.mycompany;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="persona_detalles")
public class PersonaDetalles {
    
    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int idPersonaDetalles;
    
    private String curp;
    private String nss;
    
    @OneToOne(cascade= CascadeType.ALL, mappedBy="personaDetalles")
    private Persona persona;

    public PersonaDetalles() {
    }

    public PersonaDetalles(String curp, String nss) {
        this.curp = curp;
        this.nss = nss;
    }

    public int getIdPersonaDetalles() {
        return idPersonaDetalles;
    }

    public void setIdPersonaDetalles(int idPersonaDetalles) {
        this.idPersonaDetalles = idPersonaDetalles;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNss() {
        return nss;
    }

    public void setNss(String nss) {
        this.nss = nss;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
    
    
    
    @Override
    public String toString() {
        return "PersonaDetalles{" + "idPersonaDetalles=" + idPersonaDetalles + ", curp=" + curp + ", nss=" + nss + '}';
    }
    
}
