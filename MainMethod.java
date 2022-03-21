package com.motivity;

/*import java.util.ArrayList;*/
import java.util.Iterator;
import java.util.List;

//import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

public class MainMethod {
	public static void main(String[] args){
		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hib.cfg.xml").build();
		Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory factory=meta.getSessionFactoryBuilder().build();
		Session session=factory.openSession();
		Transaction t=session.beginTransaction();
		Query qr=session.createQuery("select e.employee_name,e.employee_mobile,er.employer_name from Employer er inner join Employee e on er.employer_id=e.employer");
		List li=qr.list();
		Iterator itr=li.iterator();
		while(itr.hasNext()) {
			Object[] x=(Object[])itr.next();
			System.out.println(x[0]+"  "+x[1]+"  "+x[2]);
		}
