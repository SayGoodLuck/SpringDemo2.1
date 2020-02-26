package webapp.spring.demo21;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("webapp.spring.demo21")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {
}
