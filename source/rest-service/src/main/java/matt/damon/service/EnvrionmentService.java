package matt.damon.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import matt.damon.core.vo.User;
import matt.damon.exception.RestException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

@Path("/env")
public class EnvrionmentService {

    private static final Log LOG = LogFactory.getLog(EnvrionmentService.class);

    @GET
    @Path("/user/{userID}")
    @Produces(MediaType.APPLICATION_JSON + ";charset=utf-8")
    public User getUser(@PathParam("userID") String userID)
            throws RestException {
        LOG.debug(userID);

        User user = new User();
        user.setName("MattDamon");
        user.setAge(26);
        return user;
    }

    @GET
    @Path("/date")
    public void getDate() throws RestException {
        int s[] = { 1, 2, 3 };
        try {
            LOG.debug(s[3]);
        } catch (Exception e) {
            throw new RestException(e);
        }
    }
}
