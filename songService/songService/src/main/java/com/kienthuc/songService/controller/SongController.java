package com.kienthuc.songService.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kienthuc.songService.model.SongDTO;
import com.kienthuc.songService.service.SongService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/v2/songs")
public class SongController {
	@Autowired
	SongService songService;

	@GetMapping
	public ResponseEntity<Flux<SongDTO>> getAllOfTheSongs() {
		return ResponseEntity.ok(songService.getAllOfTheSongs());
	}
}
