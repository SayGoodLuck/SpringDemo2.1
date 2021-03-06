package webapp.spring.demo21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;


    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") RockMusic rockMusic,
                       @Qualifier("classicalMusic") ClassicalMusic classicalMusic) {
        this.rockMusic = rockMusic;
        this.classicalMusic = classicalMusic;
    }


    public void playMusic(Genre genre){
        Random random = new Random();
        int r = random.nextInt(3);
        switch (genre){
            case CLASSICAL:
                System.out.println("playing: " + classicalMusic.getSong().get(r));
                break;
            case ROCK:
                System.out.println("playing: " + rockMusic.getSong().get(r));
                break;
        }
    }

}
