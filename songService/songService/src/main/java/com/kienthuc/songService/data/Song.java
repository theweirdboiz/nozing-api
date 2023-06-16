package com.kienthuc.songService.data;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@Table(name = "songs")
public class Song {
	@Id
	private String id;
	private String name;
	private String source;
	private String alias;
	private String thumbnail;
	private String thumbnailM;
	private String link;
	private Integer duration;
	private Long releaseDate;
	private Long like;
	private Long listen;
}