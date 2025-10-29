package pt.ipleiria.estg.dei.ei.dae.academics.ejbs;

import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import pt.ipleiria.estg.dei.ei.dae.academics.Student;

@Stateless
public class StudentBean{

    @PersistenceContext
    private EntityManager entityManager;

    public void create(String userName, String password, String name, String email) {
        Student student = new Student(userName, password, name, email );
        entityManager.persist(student);
    }
}

