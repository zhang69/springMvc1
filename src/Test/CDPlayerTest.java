package Test;

import Bean.AnimalPerformance;
import Bean.CDPlayerConfig;
import Bean.CDPlayerConfigNoAutowised;
import BeanInterface.CompactDisc;
import BeanInterface.MediaPlayer;
import QualifierAno.happy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * 测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)//加载上下文
@ContextConfiguration(classes= CDPlayerConfig.class)//ApplicationContext加载配置文件 xml or class
//@ContextConfiguration(locations="../applicationContext.xml")
//@ContextConfiguration(classes= CDPlayerConfigNoAutowised.class)
public class CDPlayerTest {

    @Autowired//第三方库装配则无法使用自动装配
    @happy
    private CompactDisc cd;

    @Autowired
    private MediaPlayer mp;

    @Autowired
    private AnimalPerformance ap;

    @Test
    public void cdShouldNotBeNull(){
        assertNotNull(cd);
        cd.play();
    }
    @Test
    public void play(){
        mp.play();
    }

    @Test
    public void animalPerform(){
        ap.perform();
    }
}
