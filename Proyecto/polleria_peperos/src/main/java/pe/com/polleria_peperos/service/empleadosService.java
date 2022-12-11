package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.empleadosEntity;

public interface empleadosService {

    List<empleadosEntity> findAll();

    Optional<empleadosEntity> findById(Long id);

    empleadosEntity add(empleadosEntity c);

    empleadosEntity update(empleadosEntity c);

    empleadosEntity delete(empleadosEntity c);
   
    List<empleadosEntity> findAllCustom();
}
