/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mycompany.Persona;
import com.mycompany.PersonaDetalles;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Arturo
 */
public class InsertClient {

    public static void main(String[] args) {

        //si no se agrega el nombre, este debe ser hibernate.cfg
        //en caso contrario, proveer dicho nombre
        SessionFactory myFactory = new Configuration()
                .configure()
                .addAnnotatedClass(Persona.class)
                .addAnnotatedClass(PersonaDetalles.class)
                .buildSessionFactory();

        Session mySession = myFactory.openSession();

        try {
            
            //insert
            
            Persona persona = new Persona("Jorge", "Bermudez","jorge@mail.com","1846798579");
            
            //Curp 18 digist
            //nss 11
            PersonaDetalles detalles = new PersonaDetalles("I38DUEHR63YSGAVDH2","16487554614");
            persona.setPersonaDetalles(detalles);
            
            mySession.beginTransaction();
            mySession.save(persona);
            mySession.getTransaction().commit();
            System.out.println("<Registro insertado>"); 
            
            /*
            //delete
            mySession.beginTransaction();
            Persona p = mySession.get(Persona.class, 1);
            
            if(p != null){
                System.out.println(p);
                mySession.delete(p);
            }
            
            mySession.getTransaction().commit();*/
        }catch(Exception e){
           
            e.printStackTrace();

        } finally {
            mySession.close();
            myFactory.close();
        }

    }
}
