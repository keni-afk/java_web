
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.clientesEntity;

public interface clientesService {

    List<clientesEntity> findAll();

    Optional<clientesEntity> findById(Long id);

    clientesEntity add(clientesEntity c);

    clientesEntity update(clientesEntity c);

    clientesEntity delete(clientesEntity c);

    List<clientesEntity> findAllCustom();
}
