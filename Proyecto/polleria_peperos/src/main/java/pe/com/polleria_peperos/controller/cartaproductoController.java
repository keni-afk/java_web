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
import pe.com.polleria_peperos.entity.cartaproductoEntity;
import pe.com.polleria_peperos.service.cartaproductoService;

@RestController
@RequestMapping("/cartaproducto")
public class cartaproductoController {

    @Autowired
    private cartaproductoService cartaproductoservice;

    @GetMapping
    public List<cartaproductoEntity> findAll() {
        return cartaproductoservice.findAll();
    }

    @GetMapping("/custom")
    public List<cartaproductoEntity> findAllCustom() {
        return cartaproductoservice.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<cartaproductoEntity> findById(@PathVariable Long id) {
        return cartaproductoservice.findById(id);
    }

    @PostMapping
    public cartaproductoEntity add(@RequestBody cartaproductoEntity c) {
        return cartaproductoservice.add(c);
    }

    @PutMapping("/{id}")
    public cartaproductoEntity update(@PathVariable Long id, @RequestBody cartaproductoEntity c) {
        c.setCodigo(id);
        return cartaproductoservice.update(c);
    }

    @DeleteMapping("/{id}")
    public cartaproductoEntity delete(@PathVariable Long id) {

        cartaproductoEntity objcategoria = new cartaproductoEntity();
        objcategoria.setEstado(false);
        return cartaproductoservice.delete(cartaproductoEntity.builder().codigo(id).build());
    }
}
