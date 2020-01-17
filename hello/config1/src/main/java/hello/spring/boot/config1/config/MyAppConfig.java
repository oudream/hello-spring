package hello.spring.boot.config1.config;


import hello.spring.boot.config1.bean.Person;
import hello.spring.boot.config1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件 在配置文件中用<bean><bean/>标签添加组件
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService02() {
        System.out.println("配置类@Bean给容器中添加组件了...");
        return new HelloService();
    }

}
