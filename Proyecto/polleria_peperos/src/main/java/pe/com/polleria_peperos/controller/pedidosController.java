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
import pe.com.polleria_peperos.entity.pedidosEntity;
import pe.com.polleria_peperos.service.pedidosService;

@RestController
@RequestMapping("/pedidos")

public class pedidosController {

    @Autowired
    private pedidosService pedidosservice;

    @GetMapping
    public List<pedidosEntity> findAll() {
        return pedidosservice.findAll();
    }

    @GetMapping("/custom")
    public List<pedidosEntity> findAllCustom() {
        return pedidosservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<pedidosEntity> findById(@PathVariable Long id) {
        return pedidosservice.findById(id);
    }

    @PostMapping
    public pedidosEntity add(@RequestBody pedidosEntity c) {
        return pedidosservice.add(c);
    }

    @PutMapping("/{id}")
    public pedidosEntity update(@PathVariable Long id, @RequestBody pedidosEntity c) {
        c.setCodigo(id);
        return pedidosservice.update(c);
    }

    @DeleteMapping("/{id}")
    public pedidosEntity delete(@PathVariable Long id) {

        pedidosEntity objcategoria = new pedidosEntity();
        objcategoria.setEstado(false);
        return pedidosservice.delete(pedidosEntity.builder().codigo(id).build());
    }
}
