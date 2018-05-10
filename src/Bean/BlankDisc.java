package Bean;

import BeanInterface.CompactDisc;

/**
 * 用来测试手动注入以及写死了的字符串注入
 */
public class BlankDisc implements CompactDisc {
    private String name;
    private String title;
    public BlankDisc(String name,String title){
        this.name = name;
        this.title = title;
    }
    @Override
    public void play() {
        System.out.println(name+":"+title);
    }
}
