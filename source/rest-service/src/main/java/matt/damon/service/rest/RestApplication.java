package matt.damon.service.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.core.Application;

import matt.damon.service.EnvrionmentService;
import matt.damon.service.rest.provider.RestExceptionMapper;

public class RestApplication extends Application {

    HashSet<Object> singletons = new HashSet<Object>();

    public RestApplication() {
        singletons.add(new RestExceptionMapper());
        singletons.add(new EnvrionmentService());
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }

}
