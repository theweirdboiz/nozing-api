package com.kienthuc.songService.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.kienthuc.songService.data.Song;

@Repository
public interface SongRepository extends ReactiveCrudRepository<Song, String> {

}
