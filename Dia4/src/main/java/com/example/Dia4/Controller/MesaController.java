package com.example.Dia4.Controller;

import com.example.Dia4.Model.mesa;
import com.example.Dia4.Service.MesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/mesas")
public class MesaController {

    @Autowired
    private MesaService mesaService;

    // Obtener todas las mesas
    @GetMapping
    public List<mesa> getAllMesas(){
        return mesaService.getAllMesas();
    }

    // Obtener una mesa por ID
    @GetMapping("/{id}")
    public mesa getMesaById(@PathVariable Long id){
        return mesaService.getMesaById(id).orElseThrow();
    }

    // Crear una persona
    @PostMapping
    public mesa createMesa(@RequestBody mesa mesa){
        return mesaService.saveMesa(mesa);
    }

    @PutMapping("/{id}")
    public void deleteMesa(@PathVariable Long id){
        mesaService.deleteMesa(id);
    }
}