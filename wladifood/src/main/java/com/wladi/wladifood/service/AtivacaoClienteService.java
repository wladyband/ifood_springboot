package com.wladi.wladifood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wladi.wladifood.model.Cliente;
import com.wladi.wladifood.notification.Notificador;

@Component
public class AtivacaoClienteService {


	@Autowired
	private List<Notificador> notificadores;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		for (Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}
	
}
