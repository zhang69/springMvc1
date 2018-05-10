package Bean;

import BeanInterface.CompactDisc;
import BeanInterface.MediaPlayer;
import QualifierAno.happy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 基于class的手动注入
 * return的时候，new一个具体的实现类，不会出现歧义bean注入的问题了吧
 */
//@Configuration
public class CDPlayerConfigNoAutowised {
    //声明Bean，且有返回值类型即可
    @Bean
    public CompactDisc sgtPeppers(){
        return  new SgtPeppers();
    }
    @Bean
    @happy
    public MediaPlayer CDPlayer(CompactDisc cd){
        return new CDPlayer(cd);
    }
}
