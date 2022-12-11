
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.pedidosEntity;

public interface pedidosService {

    List<pedidosEntity> findAll();

    Optional<pedidosEntity> findById(Long id);

    pedidosEntity add(pedidosEntity c);

    pedidosEntity update(pedidosEntity c);

    pedidosEntity delete(pedidosEntity c);

    List<pedidosEntity> findAllCustom();
}
