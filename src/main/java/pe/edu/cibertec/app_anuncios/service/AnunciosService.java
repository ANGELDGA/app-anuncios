package pe.edu.cibertec.app_anuncios.service;

import pe.edu.cibertec.app_anuncios.model.Anuncios;

import java.util.List;

public interface AnunciosService {
    public List<Anuncios> findAll();
    public Anuncios findById(Long id);
    public Anuncios add(Anuncios anuncios);
    public Anuncios update(Anuncios anuncios);
    public void delete(Long id);
}
