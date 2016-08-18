package api;

import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import domain.User;
import service.SimpleDbExample;
import service.copymainImpl;

@Path("/hello")
public class HelloWorld {

	public HelloWorld(copymainImpl copy) {
		this.copy = copy;
	}

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
	@Produces("application/json")
	@Path("/mango")
	public List<User> helloMsg() throws SecurityException, IllegalStateException, RollbackException,
			HeuristicMixedException, HeuristicRollbackException, SystemException {
		List<User> userList = copy.fetchMe();
		return userList;

	}

	@GET
	@Path("/orange")
	public String trial() {
		return simpleDB.returnMe();
	}

}
