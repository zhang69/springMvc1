package AspectClass;


import org.aspectj.lang.annotation.*;

/**
 * 测试aop，具体的切面Audience
 * jar包需要自己从新下载
 * 三个最常用的注解，before afterreturning afterthrowing
 */
@Aspect
public class Audience {
//    @Before("execution(**AspectInterface.Performance.perform(..))*")
//    public void silenceCellPhones(){
//        System.out.println("silencing cell phone");
//    }
//    @Before("execution(**AspectInterface.Performance.perform(..))*")
//    public void takeSeats(){
//        System.out.println("Taking seats");
//    }
//    @AfterReturning("execution(**AspectInterface.Performance.perform(..))*")
//    public void applause(){
//        System.out.println("clap clap clap!!!");
//    }
//    @AfterThrowing("execution(**AspectInterface.Performance.perform(..))*")
//    public void demandRefund(){
//        System.out.println("Demanding a refund");
//    }
    @Pointcut("execution(**AspectInterface.Performance.perform(..))*")
    public void performance(){}//简化代码书写
    @Before("performance()")
    public void silenceCellPhones(){
        System.out.println("silencing cell phone");
    }
    @Before("performance()")
    public void takeSeats(){
        System.out.println("Taking seats");
    }
    @AfterReturning("performance()")
    public void applause(){
        System.out.println("clap clap clap!!!");
    }
    @AfterThrowing("performance()")
    public void demandRefund(){
        System.out.println("Demanding a refund");
    }
}
