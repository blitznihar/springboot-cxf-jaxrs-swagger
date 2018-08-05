package com.fusion.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Component;
import com.fusion.model.Order;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Path("/orders")
@Api(value = "/orders", description = "To fetch all Orders")
@Component
public class OrderRestService {
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @ApiOperation(
            value = "Get operation with Response and @Default value",
            notes = "Get operation with Response and @Default value",
            response = Order.class,
            responseContainer = "List"
        )
    public List<Order> getOrders() {
    	ArrayList<Order> Orders = new ArrayList<Order>();
    	Orders.add(new Order(1233, "Iphone",900.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone-X",1200.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone 7",700.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Iphone 10",1000.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Samsung Note",1100.00,"10/12/2017"));
    	Orders.add(new Order(1233, "Samsung S9",1000.00,"10/12/2017"));
    	
    	return Orders;
    }
}