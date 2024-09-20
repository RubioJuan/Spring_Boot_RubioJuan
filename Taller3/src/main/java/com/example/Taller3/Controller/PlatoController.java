package com.example.Taller3.Controller;

import com.example.Taller3.Model.plato;
import com.example.Taller3.Service.PlatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/platos")
public class PlatoController {

    @Autowired
    private PlatoService platoService;

    // Obtener todos los platos
    @GetMapping
    public List<plato> getAllPlatos(){
        return platoService.getAllPlatos();
    }

    // Obtener a un plato por Id
    @GetMapping("/{id}")
    public plato getPlatoById(@PathVariable Long id){
        return platoService.getPlatoById(id).orElseThrow();
    }

    @PostMapping
    public plato createPlato(@RequestBody plato plato){
        return platoService.savePlato(plato);
    }

    @PutMapping("/{id}")
    public plato updatePlato(@PathVariable Long id, @RequestBody plato plato){
        return platoService.updatePlato(id, plato);
    }

    @DeleteMapping("/{id}")
    public void deletePlato(@PathVariable Long id){
        platoService.deletePlato(id);
    }
}
