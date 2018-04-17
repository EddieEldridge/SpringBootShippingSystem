package com.ships.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ships.model.OrderInfo;
import com.ships.model.Ship;
import com.ships.repositories.OrderInterface;
import com.ships.repositories.ShipInterface;

@Service // Define the following class as a service (https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/stereotype/Service.html)
public class OrderInfoService 
{
	@Autowired // This means to get the bean called OrderInterface, Which is auto-generated by Spring, we will use it to handle the data
	private OrderInterface orderInterface;
	
	public ArrayList<OrderInfo> listAll()
	{
		// Find all elements in the 'Ship' table and put them in an ArrayList called 'ships', then return the Ship arrayList
		return (ArrayList<OrderInfo>) orderInterface.findAll();
	}
}
