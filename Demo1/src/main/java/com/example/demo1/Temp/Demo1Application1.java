package com.example.demo1.Temp;
import com.example.demo1.yes.very.deep.pack.DeepComponent;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = DeepComponent.class)
public class Demo1Application1 {

    public static void main(String[] args) {
        ApplicationContext applicationContext =SpringApplication.run(Demo1Application1.class, args);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}

