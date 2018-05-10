package Bean;

import AspectInterface.Performance;
import org.springframework.stereotype.Component;

@Component
public class AnimalPerformance implements Performance {
    @Override
    public void perform() {
        System.out.println("演员");
    }
}
