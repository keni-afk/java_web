
package pe.com.polleria_peperos.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.polleria_peperos.entity.clientesEntity;
import pe.com.polleria_peperos.repository.clientesRepository;

@Service
public class clientesServiceImpl implements clientesService{
    @Autowired
    private clientesRepository clientesrepositorio;
    
    
    @Override
    public List<clientesEntity> findAll() {
        return clientesrepositorio.findAll();
    }

    @Override
    public Optional<clientesEntity> findById(Long id) {
        return clientesrepositorio.findById(id);
    }

    @Override
    public clientesEntity add(clientesEntity c) {
        return clientesrepositorio.save(c);
    }

    @Override
    public clientesEntity update(clientesEntity c) {
        clientesEntity objcurso=clientesrepositorio.getById(c.getCodigo());
        BeanUtils.copyProperties(c, objcurso);
        return clientesrepositorio.save(objcurso);
    }

    @Override
    public clientesEntity delete(clientesEntity c) {
        clientesEntity objcurso=clientesrepositorio.getById(c.getCodigo());
        objcurso.setEstado(false);
        return clientesrepositorio.save(objcurso);
    }


    @Override
    public List<clientesEntity> findAllCustom() {
        return clientesrepositorio.findAllCustom();
    }
      
}
