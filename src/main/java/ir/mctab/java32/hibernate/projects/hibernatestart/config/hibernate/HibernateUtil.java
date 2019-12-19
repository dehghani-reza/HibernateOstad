package ir.mctab.java32.hibernate.projects.hibernatestart.config.hibernate;


import org.hibernate.SessionFactory;

import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    static SessionFactory sessionFactory;

    static {
        sessionFactory = new Configuration().configure().buildSessionFactory();
    }

    public static SessionFactory getSession(){
        return sessionFactory;
    }
}
