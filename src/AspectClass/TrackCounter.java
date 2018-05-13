package AspectClass;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by root on 18-5-13.
 */
//@Aspect
public class TrackCounter {
    private Map<Integer,Integer> trackCOunts=new HashMap<Integer,Integer>();
    //@Pointcut("execution(* BeanInterface.CompactDisc.playTrack(int))&&args(trackNumber)")
    public void trackPlayed(int trackNumber){

    }

    //@Before("trackPlayed(trackNumber)")
    public void countTrack(int trackNumber){
        int currentCOunt = getPlayCount(trackNumber);
        trackCOunts.put(trackNumber,currentCOunt+1);
    }

    public int getPlayCount(int trackNumber) {
        return trackCOunts.containsKey(trackNumber)?trackCOunts.get(trackNumber):0;
    }


}
