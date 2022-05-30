package com.bpfoodapi.bpfoodapi.notificacao;

import com.bpfoodapi.bpfoodapi.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorSMS implements Notificador {
    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notifiacando %s atravavés do SMS %s: %s \n",
                cliente.getNome(), cliente.getTelefone(), mensagem);
    }
}
