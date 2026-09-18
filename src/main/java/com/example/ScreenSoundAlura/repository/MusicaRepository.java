package com.example.ScreenSoundAlura.repository;

import com.example.ScreenSoundAlura.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MusicaRepository extends JpaRepository<Musica, Long> {

    List<Musica> findByArtistaNomeContainingIgnoreCase(String nome);
}
