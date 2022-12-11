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
import pe.com.polleria_peperos.entity.empleadosEntity;
import pe.com.polleria_peperos.service.empleadosService;

@RestController
@RequestMapping("/empleados")
public class empleadosController {

    @Autowired
    private empleadosService empleadosservice;

    @GetMapping
    public List<empleadosEntity> findAll() {
        return empleadosservice.findAll();
    }

    @GetMapping("/custom")
    public List<empleadosEntity> findAllCustom() {
        return empleadosservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<empleadosEntity> findById(@PathVariable Long id) {
        return empleadosservice.findById(id);
    }

    @PostMapping
    public empleadosEntity add(@RequestBody empleadosEntity c) {
        return empleadosservice.add(c);
    }

    @PutMapping("/{id}")
    public empleadosEntity update(@PathVariable Long id, @RequestBody empleadosEntity c) {
        c.setCodigo(id);
        return empleadosservice.update(c);
    }

    @DeleteMapping("/{id}")
    public empleadosEntity delete(@PathVariable Long id) {

        empleadosEntity objcategoria = new empleadosEntity();
        objcategoria.setEstado(false);
        return empleadosservice.delete(empleadosEntity.builder().codigo(id).build());
    }
}
