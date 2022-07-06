package com.example.api.controller;

import com.example.api.entity.Album;
import com.example.api.service.IAlbumsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class AlbumsController {

    @Autowired
    private IAlbumsService serviceAlbums;

    @GetMapping("/all")
    public List<Album> buscarTodos(){
        return serviceAlbums.buscarTodos();
    }

    @PostMapping("/save")
    public ResponseEntity<Album> guardar(@RequestBody  Album album){
            serviceAlbums.guardar(album);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

    @PutMapping("/edit")
    public ResponseEntity<Album> modificar(@RequestBody Album album){
            serviceAlbums.guardar(album);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Album> eliminar(@PathVariable("id") int idAlbum){
            Album album = serviceAlbums.buscarPorId(idAlbum);
            if(album == null) {
                return new ResponseEntity<Album>(album, HttpStatus.INTERNAL_SERVER_ERROR);
            }
            serviceAlbums.eliminar(idAlbum);
        return new ResponseEntity<Album>(album, HttpStatus.OK);
    }

}
