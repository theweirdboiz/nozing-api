package com.kienthuc.songService.data;

import java.math.BigInteger;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "songs")
public class Song {
	@Id
	private String id;
	private String name;
	private String source;
	private String alias;
	private String thumbnailM;
	private String thumbnail;
	private String link;
	private Integer duration;
	private BigInteger releaseDate;
	private Long like;
	private Long listen;
//	private Album album;
//	private List<Artist> artists;
//	private List<Genre> genres;
}