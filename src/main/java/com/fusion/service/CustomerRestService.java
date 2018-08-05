package com.fusion.service;

import java.util.ArrayList;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

import org.springframework.stereotype.Component;

import com.fusion.model.Customer;

@Path("/customers")
@Api(value = "/customers", description = "To fetch all Customers")
@Component
public class CustomerRestService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(
            value = "Get operation with Response and @Default value",
            notes = "Get operation with Response and @Default value",
            response = Customer.class,
            responseContainer = "List"
        )
    public List<Customer> getCustomers() {
    	ArrayList<Customer> customers = new ArrayList<Customer>();
    	customers.add(new Customer("John", "Smith","John.Smith@kenbengmail.com","+1 3124567898"));
    	customers.add(new Customer("Jenny", "Smith","Jenny.Smith@kenbengmail.com","+1 3124567898"));
    	customers.add(new Customer("Shawn", "Doe","Shawn.Doe@kenbengmail.com","+1 3124562342"));
    	customers.add(new Customer("Drunk", "Bro","Drunk.Bro@kenbengmail.com","+1 3124562342"));
    	return customers;
    }
}