package com.example.ScreenSoundAlura.repository;

import com.example.ScreenSoundAlura.model.Artista;
import org.aspectj.apache.bcel.util.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtistaRepository extends JpaRepository<Artista, Long> {
}
