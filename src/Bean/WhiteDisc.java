package Bean;

import BeanInterface.CompactDisc;
import QualifierAno.happy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 此处声明自定义标签@happy
 * 使用到的技术是Qualifier
 */
@Component
@happy
public class WhiteDisc implements CompactDisc {
    private String name="white";
    private String title="disc";
    @Override
    public void play() {
        System.out.println(name+":"+title);
    }
}
