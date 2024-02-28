package com.tybsc.hibernate7_ManyToManyAllop;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
	private static SessionFactory factory;
	
    public static void main( String[] args )
    {
    	factory = new Configuration().configure().buildSessionFactory();
    	
    	Certificate c1 = new Certificate("MCA");
    	Certificate c2 = new Certificate("MBA");
    	Certificate c3 = new Certificate("PMP");
    	
    	addCertificate(c1);
    	addCertificate(c2);
    	addCertificate(c3);
    
    Hash          
    
    }
	
}

