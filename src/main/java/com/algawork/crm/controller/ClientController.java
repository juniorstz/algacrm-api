package com.algawork.crm.controller;

import com.algawork.crm.model.cliente;
import com.algawork.crm.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clientes")
public class ClientController {

    @Autowired
    private ClienteRepository ClienteRepository;

    @GetMapping
    public List<cliente> listar(){
        return ClienteRepository.findAll();


    }
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public cliente adicionar(@RequestBody cliente cliente){
        return ClienteRepository.save(cliente);
    }

}
