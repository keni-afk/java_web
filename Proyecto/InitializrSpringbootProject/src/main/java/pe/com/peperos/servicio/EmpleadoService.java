
package pe.com.peperos.servicio;

import java.util.List;
import java.util.Optional;
import org.springframework.security.core.userdetails.UserDetailsService;
import pe.com.peperos.dto.EmpleadoRegistroDTO;
import pe.com.peperos.entity.EmpleadoEntity;

public interface EmpleadoService extends UserDetailsService{
  
    List<EmpleadoEntity> findAll();

    Optional<EmpleadoEntity> findById(Long id);

    EmpleadoEntity add(EmpleadoRegistroDTO e);

    EmpleadoEntity update(EmpleadoEntity e);

    EmpleadoEntity delete(EmpleadoEntity e);

    List<EmpleadoEntity> findAllCustom();
    
}
