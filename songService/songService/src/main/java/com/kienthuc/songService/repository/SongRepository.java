package com.kienthuc.songService.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.kienthuc.songService.data.Song;

public interface SongRepository extends ReactiveCrudRepository<Song, String> {

}
