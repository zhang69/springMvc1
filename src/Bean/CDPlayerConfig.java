package Bean;

import AspectClass.Audience;
import BeanInterface.CompactDisc;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 基于class的自动注入
 * 声明配置类
 * 开启aop代理
 * 设置组件扫描
 */
//@Configuration
//@EnableAspectJAutoProxy
//@ComponentScan(basePackageClasses = {SgtPeppers.class, CompactDisc.class})//safe 不加不会自动扫描
public class CDPlayerConfig {
}
