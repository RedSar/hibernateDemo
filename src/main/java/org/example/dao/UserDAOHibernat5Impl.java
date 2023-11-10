package org.example.dao;

import org.example.entity.User;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class UserDAOHibernat5Impl implements  UserDAO{
    private SessionFactory factory=null;
    private Session session=null;

    private SessionFactory getSessionFactory(){
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(User.class);
        factory = configuration.buildSessionFactory();

        return factory;
    }


    @Override
    public User findById(int id) {
        User user = null;
        factory = getSessionFactory();
        try{
            session = factory.openSession();
            user = session.get(User.class, id);
            System.out.println("✅ User retrieved  successfully ->" + user);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            session.close();
            factory.close();
        }
        return user;
    }

    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void save(User user) {

    }

    @Override
    public void update(User user) {

    }
}
