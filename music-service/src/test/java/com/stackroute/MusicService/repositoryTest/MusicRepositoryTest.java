package com.stackroute.MusicService.repositoryTest;
import com.stackroute.MusicService.domain.Music;
import com.stackroute.MusicService.repository.MusicRepository;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
@RunWith(SpringRunner.class)
@DataJpaTest
public class MusicRepositoryTest {

@Autowired
    private MusicRepository musicRepository;
    private Music music;

    @Before
    public void setUp()
    {
        music = new Music();
        music.setMusicId(11);
        music.setMusicName("Twisted");
        music.setMusicId(12);
        music.setMusicName("Let her go");

    }

    @After
    public void tearDown(){

        musicRepository.deleteAll();
    }


    @Test
    public void testSaveMusic(){
        musicRepository.save(music);
        Music fetchMusic = musicRepository.findById(music.getMusicId()).get();
        Assert.assertEquals(12,fetchMusic.getMusicId());

    }

    @Test
    public void testSaveMusicFailure(){
        Music testMusic = new Music(13,"You belong with me","Singer : Taylor Swift");
        musicRepository.save(music);
        Music fetchMusic= musicRepository.findById(music.getMusicId()).get();
        Assert.assertNotSame(testMusic,music);
    }

    @Test
    public void testshowAllMusic() {
        Music m = new Music(11, "Twisted", "Singer : Eminem");
        Music m1 = new Music(12, "Let her go", "Artist : Passenger ");
        musicRepository.save(m);
        musicRepository.save(m1);
        List<Music> list;
        list = new ArrayList();
        list = (List<Music>) musicRepository.findAll();
        Assert.assertEquals("Twisted", list.get(0).getMusicName());


    }


}