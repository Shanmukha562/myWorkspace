package api;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

import service.SimpleDbExample;
import service.copymainImpl;


@Path("/hello")
public class HelloWorld {
 
    private copymainImpl copy;	
	
    
    private SimpleDbExample simpleDB;


	public SimpleDbExample getSimpleDB() {
		return simpleDB;
	}



	public void setSimpleDB(SimpleDbExample simpleDB) {
		this.simpleDB = simpleDB;
	}



	public copymainImpl getCopy() {
		return copy;
	}



	public void setCopy(copymainImpl copy) {
		this.copy = copy;
	}



	@GET
	@Path("/mango")
	public String helloMsg() throws SecurityException, IllegalStateException, RollbackException, HeuristicMixedException, HeuristicRollbackException, SystemException {
 
		copy.fetchMe();
		return null;
 
	}
	
	
	@GET
	@Path("/orange")
	public String trial(){
		return simpleDB.returnMe();
	}
	
	
	
	
	
}
