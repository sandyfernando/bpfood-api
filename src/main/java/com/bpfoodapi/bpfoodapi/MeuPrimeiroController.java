package com.bpfoodapi.bpfoodapi;

import com.bpfoodapi.bpfoodapi.modelo.Cliente;
import com.bpfoodapi.bpfoodapi.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {
    private AtivacaoClienteService ativadorClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativadorClienteService){
        this.ativadorClienteService = ativadorClienteService;

        System.out.println("MeuPrimeiroController "+ ativadorClienteService);
    }
    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        Cliente sandy = new Cliente("Sandy", "sandyfernando@hotmail.com", "82981890534", true );
        ativadorClienteService.ativar(sandy);
        return "Olasad!";
    }

}
