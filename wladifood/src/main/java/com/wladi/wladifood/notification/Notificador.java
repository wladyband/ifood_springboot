package com.wladi.wladifood.notification;

import com.wladi.wladifood.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}