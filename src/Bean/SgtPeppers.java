package Bean;

import BeanInterface.CompactDisc;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * the class is used to describe spring and local history
 */
@Component("sgtPeppers")
//@Qualifier("sqt")
public class SgtPeppers implements CompactDisc {
    private String title = "s g t p e p p e r s";
    private String artist = "the beatles";
    @Override
    public void play() {
        System.out.println(title+":"+artist);//display title and artist
    }
}
