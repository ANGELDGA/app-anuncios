package pe.edu.cibertec.app_anuncios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.app_anuncios.model.Anuncios;
import pe.edu.cibertec.app_anuncios.service.AnunciosService;

import java.util.List;

@RestController
@RequestMapping("/anuncios")
@CrossOrigin(origins = {"http://localhost:4200","http://localhost:8084"})
public class AnunciosController {

    @Autowired
    private AnunciosService anunciosService;

    @GetMapping("/findAll")
    public List<Anuncios> findAll(){
        return anunciosService.findAll();
    }

    @GetMapping("/findAll/{id}")
    public ResponseEntity<Anuncios> findById(@PathVariable Long id){
        return new ResponseEntity<>(anunciosService.findById(id),HttpStatus.OK);
    }


    @PostMapping("/add")
    public ResponseEntity<Anuncios> add(@RequestBody Anuncios anuncios){
        return new ResponseEntity<>(anunciosService.add(anuncios), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Anuncios> update(@RequestBody Anuncios anuncios){
        return new ResponseEntity<>(anunciosService.update(anuncios), HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        anunciosService.delete(id);
    }

}
