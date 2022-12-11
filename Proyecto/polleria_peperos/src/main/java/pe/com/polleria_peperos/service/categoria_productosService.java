/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.categoria_productosEntity;

public interface categoria_productosService {

    List<categoria_productosEntity> findAll();

    Optional<categoria_productosEntity> findById(Long id);

    categoria_productosEntity add(categoria_productosEntity c);

    categoria_productosEntity update(categoria_productosEntity c);

    categoria_productosEntity delete(categoria_productosEntity c);

    List<categoria_productosEntity> findAllCustom();
}


