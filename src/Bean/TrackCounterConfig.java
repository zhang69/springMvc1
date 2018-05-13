package Bean;

import AspectClass.TrackCounter;
import BeanInterface.CompactDisc;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 18-5-13.
 */
//@Configuration
//@EnableAspectJAutoProxy
public class TrackCounterConfig {
    @Bean
    public CompactDisc sgtPeppers(){
        BlankDisc cd = new BlankDisc();
        cd.setName("zzy");
        cd.setTitle("today test");
        List<String> tracks = new ArrayList<>();
        tracks.add("number1");
        tracks.add("number2");
        tracks.add("number3");
        tracks.add("number4");
        cd.setTracks(tracks);
        return cd;
    }

    @Bean
    public TrackCounter trackCounter(){
        return new TrackCounter();
    }
}
