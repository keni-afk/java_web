package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.distritoEntity;

public interface distritoService {

    List<distritoEntity> findAll();

    Optional<distritoEntity> findById(Long id);

    distritoEntity add(distritoEntity c);

    distritoEntity update(distritoEntity c);

    distritoEntity delete(distritoEntity c);

    List<distritoEntity> findAllCustom();
}
