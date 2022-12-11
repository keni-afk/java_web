
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import pe.com.polleria_peperos.entity.rolesEntity;


public interface rolesService {

    List<rolesEntity> findAll();

    Optional<rolesEntity> findById(Long id);

    rolesEntity add(rolesEntity c);

    rolesEntity update(rolesEntity c);

    rolesEntity delete(rolesEntity c);
  
    List<rolesEntity> findAllCustom();
}
