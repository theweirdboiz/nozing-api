package com.kienthuc.songService.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kienthuc.songService.model.SongDTO;
import com.kienthuc.songService.repository.SongRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@Service
public class SongService {
	@Autowired
	SongRepository songRepository;

	public Flux<SongDTO> getAllOfTheSongs() {
		return songRepository.findAll().map(SongDTO::enityToDTO)
				.switchIfEmpty(Mono.error(new Exception("All of the songs is empty")));
	}
}
