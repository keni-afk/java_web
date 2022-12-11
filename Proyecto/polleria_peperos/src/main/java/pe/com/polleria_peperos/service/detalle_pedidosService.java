
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.detalle_pedidosEntity;

public interface detalle_pedidosService {

    List<detalle_pedidosEntity> findAll();

    Optional<detalle_pedidosEntity> findById(Long id);

    detalle_pedidosEntity add(detalle_pedidosEntity c);

    detalle_pedidosEntity update(detalle_pedidosEntity c);

    detalle_pedidosEntity delete(detalle_pedidosEntity c);

    List<detalle_pedidosEntity> findAllCustom();   
}
