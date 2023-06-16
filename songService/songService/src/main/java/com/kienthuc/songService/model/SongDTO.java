package com.kienthuc.songService.model;

import com.kienthuc.songService.data.Song;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SongDTO {
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

	public static Song dtoToEnity(SongDTO songDTO) {
		Song song = new Song();
		song.setId(songDTO.getId());
		song.setName(songDTO.getName());
		song.setSource(songDTO.getSource());
		song.setThumbnail(songDTO.getThumbnail());
		song.setThumbnailM(songDTO.getThumbnailM());
		song.setLink(songDTO.getLink());
		song.setDuration(songDTO.getDuration());
		song.setReleaseDate(songDTO.getReleaseDate());
		song.setLike(songDTO.getLike());
		song.setListen(songDTO.getListen());
		return song;
	}

	public static SongDTO enityToDTO(Song song) {
		System.out.println(song);
		SongDTO songDTO = new SongDTO();
		songDTO.setId(song.getId());
		songDTO.setName(song.getName());
		songDTO.setAlias(song.getAlias());
		songDTO.setSource(song.getSource());
		songDTO.setThumbnail(song.getThumbnail());
		songDTO.setThumbnailM(song.getThumbnailM());
		songDTO.setLink(song.getLink());
		songDTO.setDuration(song.getDuration());
		songDTO.setReleaseDate(song.getReleaseDate());
		songDTO.setLike(song.getLike());
		songDTO.setListen(song.getListen());
		return songDTO;
	}
}
