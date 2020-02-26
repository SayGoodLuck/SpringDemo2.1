package webapp.spring.demo21;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;


public class MusicPlayer {

    private ClassicalMusic classicalMusic;
    private RockMusic rockMusic;



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
