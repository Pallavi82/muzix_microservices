package com.stackroute.MusicService.service;

import com.stackroute.MusicService.exceptions.MusicAlreadyExistsException;
import com.stackroute.MusicService.exceptions.MusicNotFoundException;
import com.stackroute.MusicService.domain.Music;

import java.util.List;

public interface MusicService {
    public Music saveMusic(Music music) throws MusicAlreadyExistsException;
    public List<Music> showAllMusic();
    public Music updateComment(Music music) throws MusicNotFoundException;
    public boolean deleteMusic(Music music) throws MusicNotFoundException;
    //public List<Music> getMusicByName(String musicName) throws MusicNotFoundException;
}
