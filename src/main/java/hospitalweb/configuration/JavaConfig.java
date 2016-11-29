package hospitalweb.configuration;

import hospitalweb.domain.factory.DoctorFactory;
import hospitalweb.domain.factory.PacientFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean
    public PacientFactory pacientFactory(){
        return new PacientFactory();
    }

    @Bean
    public DoctorFactory doctorFactory(){
        return new DoctorFactory();
    }
}
