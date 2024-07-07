package pe.edu.cibertec.app_anuncios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.cibertec.app_anuncios.model.Anuncios;

public interface AnunciosRepository extends JpaRepository<Anuncios, Long> {
}
