package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.empleadosEntity;
import pe.com.polleria_peperos.repository.empleadosRepository;


@Service
public class empleadosServiceImpl implements empleadosService {

    @Autowired
    private empleadosRepository empleadosrepositorio;
    
    
    @Override
    public List<empleadosEntity> findAll() {
        return empleadosrepositorio.findAll();
    }

    @Override
    public Optional<empleadosEntity> findById(Long id) {
        return empleadosrepositorio.findById(id);
    }

    @Override
    public empleadosEntity add(empleadosEntity c) {
        return empleadosrepositorio.save(c);
    }

    @Override
    public empleadosEntity update(empleadosEntity c) {
        empleadosEntity objcurso=empleadosrepositorio.getById(c.getCodigo());

        BeanUtils.copyProperties(c, objcurso);
        return empleadosrepositorio.save(objcurso);
    }

    @Override
    public empleadosEntity delete(empleadosEntity c) {
        empleadosEntity objcurso=empleadosrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return empleadosrepositorio.save(objcurso);
    }


    @Override
    public List<empleadosEntity> findAllCustom() {
        return empleadosrepositorio.findAllCustom();
    }
    
}
