package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.cartaproductoEntity;

public interface cartaproductoService {

    List<cartaproductoEntity> findAll();

    Optional<cartaproductoEntity> findById(Long id);

    cartaproductoEntity add(cartaproductoEntity c);

    cartaproductoEntity update(cartaproductoEntity c);

    cartaproductoEntity delete(cartaproductoEntity c);

    List<cartaproductoEntity> findAllCustom();
}
