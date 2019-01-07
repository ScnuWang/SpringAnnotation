package work.morem.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import work.morem.bean.Person;

@Configuration
public class SpringConfig {

    /*
    * 默认使用方法名作为Bean的id
    * */
    @Bean(name = "person")
    public Person person(){
        Person person = new Person("jason",26);
        return person;
    }
}
