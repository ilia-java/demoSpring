package dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DIConfiguration {
    @Bean
    public MessageService getMessage(){

        return new EmailService();
    }


}
