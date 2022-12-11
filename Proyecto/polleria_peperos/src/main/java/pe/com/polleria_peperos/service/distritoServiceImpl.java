package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.distritoEntity;
import pe.com.polleria_peperos.repository.distritoRepository;

@Service
public class distritoServiceImpl implements distritoService{
    @Autowired
    private distritoRepository distritorepositorio;
    
    
    @Override
    public List<distritoEntity> findAll() {
        return distritorepositorio.findAll();
    }

    @Override
    public Optional<distritoEntity> findById(Long id) {
        return distritorepositorio.findById(id);
    }

    @Override
    public distritoEntity add(distritoEntity c) {
        return distritorepositorio.save(c);
    }

    @Override
    public distritoEntity update(distritoEntity c) {
        distritoEntity objdistrito=distritorepositorio.getById(c.getCodigo());
    
        BeanUtils.copyProperties(c, objdistrito);
        return distritorepositorio.save(objdistrito);
    }

    @Override
    public distritoEntity delete(distritoEntity c) {
        distritoEntity objdistrito=distritorepositorio.getById(c.getCodigo());
        objdistrito.setEstado(false);
        return distritorepositorio.save(objdistrito);
    }

    @Override
    public List<distritoEntity> findAllCustom() {
        return distritorepositorio.findAllCustom();
    }
    
}
