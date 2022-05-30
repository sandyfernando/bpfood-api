package com.bpfoodapi.bpfoodapi.notificacao;

import com.bpfoodapi.bpfoodapi.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem){
        System.out.printf("Notifiacando %s atravavés do email %s: %s \n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
