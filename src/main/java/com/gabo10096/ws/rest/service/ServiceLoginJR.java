package com.gabo10096.ws.rest.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.gabo10096.ws.rest.vo.VOUsuario;

@Path("/gabo10096")
public class ServiceLoginJR {
	
	@POST
	@Path ("/validaUsuario")
	@Consumes({MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_JSON})
	public VOUsuario validaUsuario(VOUsuario vo){
		vo.setUserValidado(false);
		if(vo.getUsuario().equals("Java") && vo.getPassword().equals("Revolutions")) {
			vo.setUserValidado(true);
		}
		return vo;
	}

}
