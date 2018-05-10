package Bean;

import BeanInterface.CompactDisc;
import BeanInterface.MediaPlayer;
import QualifierAno.happy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Bean，声明为组件，可以实现自动注入
 * Autowired是写在需要注入的地方！
 * @happy 是自定义标签
 */
@Component
public class CDPlayer implements MediaPlayer {

    private CompactDisc cd;
    @Autowired(required = false)
    @happy
    public CDPlayer(CompactDisc cd){
        this.cd = cd;
    }
    @Override
    public void play() {
        cd.play();
    }
}
