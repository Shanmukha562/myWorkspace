package service;


import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transactional;

import org.hibernate.SessionFactory;

import api.HelloWorld;
import domain.User;


public class copymainImpl {

    static SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		copymainImpl.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	@Transactional	
	public static List<User> fetchMe() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
		sessionFactory.getCurrentSession().beginTransaction();
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession().createQuery("from User").list();
	//	query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		//@SuppressWarnings("unchecked")
       // List<User> listUser = (List<User>) query.list();
         
		
		
        if (listUser != null && !listUser.isEmpty()) {
        	System.out.println("found sth");
        	
        	
        	/*System.out.println(listUser.get(0).getPassword());
        	System.out.println(listUser.get(0).getUsername());*/
        	
        	for(User user: listUser){
        		System.out.println("username is " + user.getUsername());
        		System.out.println("password is " + user.getPassword());
        	}
        	
        	
        }else{
        	System.out.println("found nth");
        }
        
        
        sessionFactory.getCurrentSession().getTransaction().commit();
        sessionFactory.getCurrentSession().close();
        
		return null;
	}
	
	
	
	
}
