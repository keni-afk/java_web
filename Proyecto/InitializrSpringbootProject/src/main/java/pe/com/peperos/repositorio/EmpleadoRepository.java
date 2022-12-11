package pe.com.peperos.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.com.peperos.entity.EmpleadoEntity;

@Repository
public interface EmpleadoRepository extends
        JpaRepository<EmpleadoEntity, Long> {

    public EmpleadoEntity findByEmail(String email);
    
}
