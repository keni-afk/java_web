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
import pe.com.polleria_peperos.entity.distritoEntity;
import pe.com.polleria_peperos.service.distritoService;

@RestController

@RequestMapping("/distrito")
public class distritoController {

    @Autowired
    private distritoService distritoservice;

    @GetMapping
    public List<distritoEntity> findAll() {
        return distritoservice.findAll();
    }

    @GetMapping("/custom")
    public List<distritoEntity> findAllCustom() {
        return distritoservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<distritoEntity> findById(@PathVariable Long id) {
        return distritoservice.findById(id);
    }

    @PostMapping
    public distritoEntity add(@RequestBody distritoEntity c) {
        return distritoservice.add(c);
    }

    @PutMapping("/{id}")
    public distritoEntity update(@PathVariable Long id, @RequestBody distritoEntity c) {
        c.setCodigo(id);
        return distritoservice.update(c);
    }

    @DeleteMapping("/{id}")
    public distritoEntity delete(@PathVariable Long id) {

        distritoEntity objcategoria = new distritoEntity();
        objcategoria.setEstado(false);
        return distritoservice.delete(distritoEntity.builder().codigo(id).build());
    }
}
