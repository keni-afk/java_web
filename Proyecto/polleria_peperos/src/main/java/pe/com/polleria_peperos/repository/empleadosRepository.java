package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.empleadosEntity;

public interface empleadosRepository extends JpaRepository<empleadosEntity, Long> {

    @Query("select c from empleadosEntity c where c.estado=1")
    List<empleadosEntity> findAllCustom();
}
