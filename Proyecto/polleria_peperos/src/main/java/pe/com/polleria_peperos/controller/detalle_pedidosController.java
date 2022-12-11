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
import pe.com.polleria_peperos.entity.detalle_pedidosEntity;
import pe.com.polleria_peperos.service.detalle_pedidosService;

@RestController
@RequestMapping("/detalle_pedidos")

public class detalle_pedidosController {

    @Autowired
    private detalle_pedidosService detalle_pedidosservice;

    @GetMapping
    public List<detalle_pedidosEntity> findAll() {
        return detalle_pedidosservice.findAll();
    }

    @GetMapping("/custom")
    public List<detalle_pedidosEntity> findAllCustom() {
        return detalle_pedidosservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<detalle_pedidosEntity> findById(@PathVariable Long id) {
        return detalle_pedidosservice.findById(id);
    }

    @PostMapping
    public detalle_pedidosEntity add(@RequestBody detalle_pedidosEntity c) {
        return detalle_pedidosservice.add(c);
    }

    @PutMapping("/{id}")
    public detalle_pedidosEntity update(@PathVariable Long id, @RequestBody detalle_pedidosEntity c) {
        c.setCodigo(id);
        return detalle_pedidosservice.update(c);
    }

    @DeleteMapping("/{id}")
    public detalle_pedidosEntity delete(@PathVariable Long id) {

        detalle_pedidosEntity objcategoria = new detalle_pedidosEntity();
        objcategoria.setEstado(false);
        return detalle_pedidosservice.delete(detalle_pedidosEntity.builder().codigo(id).build());
    }
}
