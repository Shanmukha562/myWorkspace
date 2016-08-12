package service;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunIt {

	public static void main(String[] args) throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
		ApplicationContext context = 
	             new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("hello");
		
		copymainImpl con = (copymainImpl)context.getBean("copy");
 
		con.fetchMe();
	}
}
