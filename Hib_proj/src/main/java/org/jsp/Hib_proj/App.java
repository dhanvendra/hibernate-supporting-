package org.jsp.Hib_proj;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Project Started");
    	 Configuration conf=new Configuration();
    	 conf.configure();
    	 SessionFactory sef=conf.buildSessionFactory();
    	 System.out.println(sef);
    }
}
