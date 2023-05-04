package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();

        //listar
        //personaDao.listar();
        //insertar
        
        /*
        Persona persona = new Persona();
        persona.setNombre("David");
        persona.setApellido("Rodriguez");
        persona.setEmail("david@mail.com");
        persona.setTelefono("2459981973");
        personaDao.insertar(persona);
        personaDao.listar();*/
         
        
        //modificar
        /*
        Persona persona = new Persona();
        persona.setIdPersona(1);
        persona = personaDao.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = " + persona);
        persona.setApellido("Cortes");
        personaDao.modificar(persona);
        personaDao.listar();
        */
        
        //delete
        /*
        Persona persona = new Persona();
        persona.setIdPersona(37);
        personaDao.eliminar(persona);
        personaDao.listar();*/

    }
}
