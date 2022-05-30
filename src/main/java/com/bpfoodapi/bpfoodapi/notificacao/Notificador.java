package com.bpfoodapi.bpfoodapi.notificacao;

import com.bpfoodapi.bpfoodapi.modelo.Cliente;

public interface Notificador {
    void notificar(Cliente cliente, String mensagem);
}
