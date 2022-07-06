package com.example.api.repository;

import com.example.api.entity.Album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlbumsRepository extends JpaRepository<Album,Integer> {

}
