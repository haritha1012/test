package com;
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment

//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment
//this is s comment



import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import model.Item;

@Path("/Items")
public class ItemService {
	Item itemObj = new Item();

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readItems() {
		return "Hello";
	}

	@GET
	@Path("/")
	@Produces(MediaType.TEXT_HTML)
	public String readItems() {
		return itemObj.readItems();
	}

	
}