
package com.stackroute.MusicService.seedData;
import com.stackroute.MusicService.domain.Music;
import com.stackroute.MusicService.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;
import org.jboss.logging.Logger;

@Component
@PropertySource("classpath:application.properties")
public class PropertySourceSeedData implements ApplicationListener<ContextRefreshedEvent> {
    private static final Logger logs = Logger.getLogger(PropertySourceSeedData.class);
    private MusicRepository musicRepository;

    @Autowired
    public PropertySourceSeedData(MusicRepository musicRepository) {
        this.musicRepository = musicRepository;
    }

    @Value("${musicId}")
    private int musicId;

    @Value("${musicName}")
    private String musicName;

    @Value("${comment}")
    private String comment;

    @Autowired
    Environment env;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        logs.info("Inserting data on start");

        Music MusicOne = new Music(musicId, musicName, comment);
        musicRepository.save(MusicOne);

        Music MusicTwo = new Music(Integer.parseInt(env.getProperty("musicId")), env.getProperty("musicName"), env.getProperty("comment"));
        musicRepository.save(MusicTwo);

        logs.info("data successfully inserted");
    }
}

