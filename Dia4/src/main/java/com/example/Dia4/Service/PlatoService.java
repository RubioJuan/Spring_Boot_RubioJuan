package com.example.Dia4.Service;

import com.example.Dia4.Model.plato;
import com.example.Dia4.Repository.PlatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlatoService {

    @Autowired
    private PlatoRepository platoRepository;

    // Obtener todos los platos
    public List<plato>getAllPlatos(){
        return platoRepository.findAll();
    }

    // Obtener un plato por ID
    public Optional<plato>getPlatoById(Long id){
        return platoRepository.findById(id);
    }

    // Guardar un plato
    public plato savePlato(plato plato){
        return platoRepository.save(plato);
    }

    // Eliminar un plato
    public void deletePlato(Long id){
        platoRepository.deleteById(id);
    }

    // Actualizar un plato
    public plato updatePlato(Long id, plato PlatoDetails){
        plato plato = platoRepository.findById(id).orElseThrow();
        plato.setNombre(PlatoDetails.getNombre());
        plato.setPrecio(PlatoDetails.getPrecio());
        plato.setDisponibilidad(PlatoDetails.getDisponibilidad());
        return platoRepository.save(plato);
    }
}