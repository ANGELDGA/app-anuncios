package pe.edu.cibertec.app_anuncios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.app_anuncios.model.Anuncios;
import pe.edu.cibertec.app_anuncios.repository.AnunciosRepository;

import java.util.List;

@Service
public class AnunciosServicesImpl implements AnunciosService{
   @Autowired
   private AnunciosRepository anunciosRepository;

   @Override
    public List<Anuncios> findAll() {
        return anunciosRepository.findAll();
    }

    @Override
    public Anuncios findById(Long id) {
        return anunciosRepository.findById(id).get();
    }

    @Override
    public Anuncios add(Anuncios anuncios) {
        return anunciosRepository.save(anuncios);
    }

    @Override
    public Anuncios update(Anuncios anuncios) {
       var anunBD = anunciosRepository.findById(anuncios.getId()).get();
       anunBD.setId(anuncios.getId());
       anunBD.setImg(anuncios.getImg());
       anunBD.setDescription(anuncios.getDescription());
       return anunciosRepository.save(anunBD);
    }

    @Override
    public void delete(Long id) {
        var anunBD = anunciosRepository.findById(id).get();
        anunciosRepository.delete(anunBD);
    }


}
