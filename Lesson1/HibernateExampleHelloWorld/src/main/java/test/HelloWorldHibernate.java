package test;

import com.mycompany.Persona;
import javax.persistence.*;
import java.util.List;

public class HelloWorldHibernate {
    
    public static void main(String[] args) {
        
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager entityManager = fabrica.createEntityManager();
        
        //String hql = "FROM Persona p";
        //String hql = "FROM Persona p WHERE p.nombre = 'Arturo'";
        //String hql = "FROM Persona p WHERE p.idPersona > 2 ORDER BY p.apellido DESC";

        String hql = "SELECT p.nombre FROM Persona p";
        Query query = entityManager.createQuery(hql);
        
        //List <Persona> personas = query.getResultList();
        List <String> personas = query.getResultList();
        
        personas.forEach(System.out::println);
        
        
        
        
    }
    
}
