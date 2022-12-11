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
import pe.com.polleria_peperos.entity.rolesEntity;
import pe.com.polleria_peperos.service.rolesService;

@RestController
@RequestMapping("/roles")
public class rolesController {

    @Autowired
    private rolesService rolesservice;

    @GetMapping
    public List<rolesEntity> findAll() {
        return rolesservice.findAll();
    }

    @GetMapping("/custom")
    public List<rolesEntity> findAllCustom() {
        return rolesservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<rolesEntity> findById(@PathVariable Long id) {
        return rolesservice.findById(id);
    }

    @PostMapping
    public rolesEntity add(@RequestBody rolesEntity c) {
        return rolesservice.add(c);
    }

    @PutMapping("/{id}")
    public rolesEntity update(@PathVariable Long id, @RequestBody rolesEntity c) {
        c.setCodigo(id);
        return rolesservice.update(c);
    }

    @DeleteMapping("/{id}")
    public rolesEntity delete(@PathVariable Long id) {

        rolesEntity objcategoria = new rolesEntity();
        objcategoria.setEstado(false);
        return rolesservice.delete(rolesEntity.builder().codigo(id).build());
    }
}
