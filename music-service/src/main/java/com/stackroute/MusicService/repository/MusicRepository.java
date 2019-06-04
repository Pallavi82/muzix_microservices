package com.stackroute.MusicService.repository;

import com.stackroute.MusicService.domain.Music;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MusicRepository extends CrudRepository<Music,Integer> {

   // public List<Music> getMusicByName(String musicName);
}

