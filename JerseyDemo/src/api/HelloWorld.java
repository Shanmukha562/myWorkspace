package api;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import mainLogic.ImplDetail;
import model.Customer;
import model.Track;
 
@Path("/hello")
public class HelloWorld {
 
	/*@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say hi and: " + msg;
 
		return Response.status(200).entity(output).build();
 
	}*/
 
	
	@GET
	@Path("/mango")
	public String helloMsg() {
 
		return "hello world";
 
	}
	
	
	/**
	 * json request example
	 * @return
	 */
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Track getTrackInJSON() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}
 
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response createTrackInJSON(Track track) {

		String result = "Track saved : " + track;
		return Response.status(201).entity(result).build();
		
	}

	/**
	 * xml response example
	 * @param pin
	 * @return
	 */
	@GET
	@Path("/{pin}")
	@Produces(MediaType.APPLICATION_XML)
	public Customer getCustomerInXML(@PathParam("pin") int pin) {

		Customer customer = new Customer();
		customer.setName("sushil");
		customer.setPin(pin);

		return customer;

	}
	
	@GET
	@Path("/sth")
	@Produces(MediaType.APPLICATION_JSON)
	public String demoMethod() {

		ImplDetail implDetail = new ImplDetail();
		String returnSth = implDetail.callMe();
		
		return returnSth;
	}
	
	
	 @GET
	 @Path("/some")
	 @Produces("text/plain")
	    public String hello(@Context HttpServletRequest req) {

	    	HttpSession session= req.getSession(true);
	    	Object foo = session.getAttribute("foo");
	    	if (foo!=null) {
	    		System.out.println(foo.toString());
	    		return "session is live";
	    	} else {
	    		foo = "bar";
	    		session.setAttribute("foo", "bar");
	    		return "session is dead";
	    	}
	    	

	    }
}
