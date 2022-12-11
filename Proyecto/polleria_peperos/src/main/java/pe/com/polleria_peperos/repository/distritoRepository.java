package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.distritoEntity;

public interface distritoRepository extends JpaRepository<distritoEntity, Long> {
    @Query("select c from distritoEntity c where c.estado=1")
    List<distritoEntity> findAllCustom();
}
