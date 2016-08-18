package service;


import java.util.ArrayList;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;

import domain.User;


public class copymainImpl {
	
	
	public copymainImpl(){
		
	}

    private static SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
 
	
	public static List<User> fetchMe() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException{
		sessionFactory.getCurrentSession().beginTransaction();
		List<User> listUser = new ArrayList<User>();
		/*Session session = sessionFactory.getCurrentSession();
		String strQuery = "from User";
		List<User> listUser = new ArrayList<User>();
        SQLQuery query = session.createSQLQuery(strQuery);*/
        //listUser = query.setResultTransformer(Transformers.aliasToBean(domain.User.class)).list();
		listUser =  sessionFactory.getCurrentSession().createSQLQuery("select * from User").setResultTransformer(Transformers.aliasToBean(domain.User.class)).list();
				 
		//query.setResultTransformer(Criteria.ALIAS_TO_ENTITY_MAP);
		
		//@SuppressWarnings("unchecked")
       // List<User> listUser = (List<User>) query.list();
         
		
	
		
        if (listUser != null && !listUser.isEmpty()) {
        	System.out.println("found sth");
        	User user1 = listUser.get(0);
        	
        	System.out.println(user1.getPassword());
        	//listUser.get(0).getPassword();
        	
        	//System.out.println(listUser.get(0).getUsername());
        	
        /*	for(User user: listUser){
        		System.out.println("username is " + user.getUsername());
        		System.out.println("password is " + user.getPassword());
        	}
        	*/
        	
        }else{
        	System.out.println("found nth");
        }
        
        
        sessionFactory.getCurrentSession().getTransaction().commit();
        sessionFactory.getCurrentSession().close();
        
		return listUser;
	}
	
	
	
	
}
