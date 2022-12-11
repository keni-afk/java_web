
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.rolesEntity;

public interface rolesRepository extends JpaRepository<rolesEntity, Long> {
    @Query("select c from rolesEntity c where c.estado=1")
    List<rolesEntity> findAllCustom();
}
