package Bean;

import BeanInterface.CompactDisc;

import java.util.List;

/**
 * 用来测试手动注入以及写死了的字符串注入
 */
public class BlankDisc implements CompactDisc {
    private String name;
    private String title;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getTracks() {
        return tracks;
    }

    public void setTracks(List<String> tracks) {
        this.tracks = tracks;
    }

    private List<String> tracks;
    public BlankDisc(String name,String title){
        this.name = name;
        this.title = title;
    }
    public BlankDisc(){

    }
    @Override
    public void play() {
        System.out.println(name+":"+title);
    }

    @Override
    public void playTrack(int trackNumber) {
        System.out.println(tracks.get(trackNumber));
    }
}
