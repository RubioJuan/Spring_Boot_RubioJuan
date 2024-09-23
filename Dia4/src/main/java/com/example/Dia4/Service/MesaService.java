package com.example.Dia4.Service;

import com.example.Dia4.Model.mesa;
import com.example.Dia4.Repository.MesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MesaService {

    @Autowired
    private MesaRepository mesaRepository;

    // Obtener todas las mesas
    public List<mesa> getAllMesas(){
        return mesaRepository.findAll();
    }

    // Obtener una mesa por ID
    public Optional<mesa>getMesaById(Long id){
        return mesaRepository.findById(id);
    }

    public void deleteMesa(Long id){
         mesaRepository.deleteById(id);
    }

    // Guardar un plato
    public mesa saveMesa(mesa mesa){
        return mesaRepository.save(mesa);
    }

    // Actualizar una mesa
    public mesa updateMesa(Long id, mesa mesaDetails){
        mesa mesa = mesaRepository.findById(id).orElseThrow();
        mesa.setNumero_mesa(mesaDetails.getNumero_mesa());
        mesa.setOcupada(mesaDetails.getOcupada());
        return mesaRepository.save(mesa);
    }
}
