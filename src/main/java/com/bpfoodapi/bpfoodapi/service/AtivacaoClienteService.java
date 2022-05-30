package com.bpfoodapi.bpfoodapi.service;

import com.bpfoodapi.bpfoodapi.modelo.Cliente;
import com.bpfoodapi.bpfoodapi.notificacao.Notificador;
import com.bpfoodapi.bpfoodapi.notificacao.NotificadorEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {
    @Autowired
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();
        notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }
}
