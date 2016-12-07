package ufg.pw.projeto_restaurante.controller;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import ufg.pw.projeto_restaurante.model.pedido.PedidoNegocio;
import ufg.pw.projeto_restaurante.model.pedido.item_pedido.ItemPedidoNegocio;

@ApplicationPath("/api")
public class ApplicationController extends Application {

	  private Set<Object> singletons = new HashSet<Object>();

	  @Override
	  public Set<Object> getSingletons() {
	    return singletons;
	  }
	  
	  public ApplicationController() {
	    singletons.add(new PedidoNegocio());
	    singletons.add(new ItemPedidoNegocio());
	  }

}
