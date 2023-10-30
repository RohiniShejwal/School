package com.BikkadIT.Embaddable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("config.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student st = new Student();
        st.setId(11);
        st.setName("Meet");
        st.setAddress("Nashik");
        st.setCity("Nashik");
        st.setFees(35000.00);
        
        Teacher tr = new Teacher();
        tr.setId(101);
        tr.setName("Rohini Shejwal");
        
        st.setTeacher(tr);
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(st);
        tx.commit();
        session.close();
        factory.close();
    }
}
