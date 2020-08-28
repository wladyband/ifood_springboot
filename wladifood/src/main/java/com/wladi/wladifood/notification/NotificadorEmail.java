package com.wladi.wladifood.notification;

import org.springframework.stereotype.Component;

import com.wladi.wladifood.model.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
 
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
