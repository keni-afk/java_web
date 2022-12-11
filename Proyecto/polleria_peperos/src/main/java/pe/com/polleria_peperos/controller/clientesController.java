package pe.com.polleria_peperos.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.polleria_peperos.entity.clientesEntity;
import pe.com.polleria_peperos.service.clientesService;

@RestController
@RequestMapping("/clientes")

public class clientesController {

    @Autowired
    private clientesService clientesservice;

    @GetMapping
    public List<clientesEntity> findAll() {
        return clientesservice.findAll();
    }

    @GetMapping("/custom")
    public List<clientesEntity> findAllCustom() {
        return clientesservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<clientesEntity> findById(@PathVariable Long id) {
        return clientesservice.findById(id);
    }

    @PostMapping
    public clientesEntity add(@RequestBody clientesEntity c) {
        return clientesservice.add(c);
    }

    @PutMapping("/{id}")
    public clientesEntity update(@PathVariable Long id, @RequestBody clientesEntity c) {
        c.setCodigo(id);
        return clientesservice.update(c);
    }

    @DeleteMapping("/{id}")
    public clientesEntity delete(@PathVariable Long id) {
        clientesEntity objcategoria = new clientesEntity();
        objcategoria.setEstado(false);
        return clientesservice.delete(clientesEntity.builder().codigo(id).build());
    }
}
