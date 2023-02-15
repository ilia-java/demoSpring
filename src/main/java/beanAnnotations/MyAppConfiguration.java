package beanAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyAppConfiguration {
    @Bean
    public MyDAOBean getMyDAOBean(){
        return new MyDAOBean();
    }
    @Bean(name= {"getMyFileSystemBean","MyFileSystemBean"})
    public MyFileSystemBean getMyFileSystemBean() {
        return new MyFileSystemBean();
    }



}
