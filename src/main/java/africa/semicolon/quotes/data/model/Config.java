package africa.semicolon.quotes.data.model;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public ModelMapper reModelMapper(){
        return new ModelMapper();
    }
}
