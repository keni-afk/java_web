
package pe.com.polleria_peperos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.polleria_peperos.entity.clientesEntity;

public interface clientesRepository extends JpaRepository<clientesEntity, Long> {
    @Query("select c from clientesEntity c where c.estado=1")
    List<clientesEntity> findAllCustom();
}
