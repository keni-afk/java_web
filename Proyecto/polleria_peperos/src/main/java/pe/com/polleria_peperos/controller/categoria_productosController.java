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
import pe.com.polleria_peperos.entity.categoria_productosEntity;
import pe.com.polleria_peperos.service.categoria_productosService;

@RestController
@RequestMapping("/categoria_productos")
public class categoria_productosController {

    @Autowired
    private categoria_productosService categoria_productosservice;

    @GetMapping
    public List<categoria_productosEntity> findAll() {
        return categoria_productosservice.findAll();
    }

    @GetMapping("/custom")
    public List<categoria_productosEntity> findAllCustom() {
        return categoria_productosservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<categoria_productosEntity> findById(@PathVariable Long id) {
        return categoria_productosservice.findById(id);
    }

    @PostMapping
    public categoria_productosEntity add(@RequestBody categoria_productosEntity c) {
        return categoria_productosservice.add(c);
    }

    @PutMapping("/{id}")
    public categoria_productosEntity update(@PathVariable Long id, @RequestBody categoria_productosEntity c) {
        c.setCodigo(id);
        return categoria_productosservice.update(c);
    }

    @DeleteMapping("/{id}")
    public categoria_productosEntity delete(@PathVariable Long id) {

        categoria_productosEntity objcategoria = new categoria_productosEntity();
        objcategoria.setEstado(false);
        return categoria_productosservice.delete(categoria_productosEntity.builder().codigo(id).build());
    }
}
