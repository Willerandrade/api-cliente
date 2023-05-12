package com.devsFuture.Cliente.service;

import com.devsFuture.Cliente.entities.Cliente;
import com.devsFuture.Cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteServiceImpl implements ClienteService{

    private final ClienteRepository clienteRepository;

    @Override
    public Cliente criar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }
}
