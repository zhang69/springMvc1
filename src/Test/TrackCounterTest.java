package Test;

import AspectClass.TrackCounter;
import Bean.TrackCounterConfig;
import BeanInterface.CompactDisc;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by root on 18-5-13.
 */
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(classes = TrackCounterConfig.class)
@ContextConfiguration(locations="../applicationContext.xml")
public class TrackCounterTest {
    @Autowired
    private CompactDisc cd;

    @Autowired
    private TrackCounter tc;

    @Test
    public void testTrackCounter(){
        cd.playTrack(2);
        assertEquals(1,tc.getPlayCount(2));
    }
}
