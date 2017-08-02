package com.aviva.documentroute.constant.jpa.manager;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.aviva.documentroute.constant.entity.EnumerationConstant;

public class EnumerationConstantManager {

    private EntityManagerFactory entityManagerFactory;
    private EntityManager entityManager;
    
    public EnumerationConstantManager(){
    	init();
    }

    public void init() {
        entityManagerFactory = Persistence.createEntityManagerFactory("unitHibernate", new java.util.HashMap());
        System.out.println(entityManagerFactory.getClass().getSimpleName());
        entityManager = entityManagerFactory.createEntityManager();
        System.out.println(entityManager.getClass().getSimpleName());
    }

    public List<String> getEnumerationList(String fact, String field) {
    	
    	List<EnumerationConstant> enumerationConstantList = 
    			entityManager.createQuery("select e from EnumerationConstant e where e.fact=:fact and e.field=:field")
    			.setParameter("fact", fact)
    			.setParameter("field", field)
    			.getResultList();
    	List<String> docTypeListStr = new ArrayList<String>();
    	
    	for (EnumerationConstant enumerationConstant : enumerationConstantList) {
			docTypeListStr.add(enumerationConstant.getValue());
		}
    	
    	return docTypeListStr;
    	
    	
        
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }
}
