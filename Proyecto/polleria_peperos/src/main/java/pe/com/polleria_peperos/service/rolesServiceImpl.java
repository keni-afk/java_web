
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.rolesEntity;
import pe.com.polleria_peperos.repository.rolesRepository;

@Service

public class rolesServiceImpl implements rolesService{
    @Autowired
    private rolesRepository rolesrepositorio;
    
    
    @Override
    public List<rolesEntity> findAll() {
        return rolesrepositorio.findAll();
    }

    @Override
    public Optional<rolesEntity> findById(Long id) {
        return rolesrepositorio.findById(id);
    }

    @Override
    public rolesEntity add(rolesEntity c) {
        return rolesrepositorio.save(c);
    }

    @Override
    public rolesEntity update(rolesEntity c) {
        rolesEntity objcurso=rolesrepositorio.getById(c.getCodigo());
    
        BeanUtils.copyProperties(c, objcurso);
        return rolesrepositorio.save(objcurso);
    }

    @Override
    public rolesEntity delete(rolesEntity c) {
        rolesEntity objcurso=rolesrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return rolesrepositorio.save(objcurso);
    }


    @Override
    public List<rolesEntity> findAllCustom() {
        return rolesrepositorio.findAllCustom();
    }
}
