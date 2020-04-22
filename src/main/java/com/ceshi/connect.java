package com.ceshi;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class connect {
    public static void main(String[]args){
        Configuration configuration =new Configuration().configure();
        SessionFactory sessionFactory=configuration.buildSessionFactory();
        Session session =sessionFactory.openSession();

        CarEntity carEntity =(CarEntity)session.get(CarEntity.class,1);
        System.out.println(carEntity.getName());
    }
}
;