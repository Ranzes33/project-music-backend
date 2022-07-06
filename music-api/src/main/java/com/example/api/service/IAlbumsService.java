package com.example.api.service;

import com.example.api.entity.Album;

import java.util.List;

public interface IAlbumsService {
    List<Album> buscarTodos();
    void guardar(Album album);
    void eliminar(int idAlbum);
    Album buscarPorId(int idAlbum);
}
