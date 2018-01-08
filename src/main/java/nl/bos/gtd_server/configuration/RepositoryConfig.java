package nl.bos.gtd_server.configuration;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Card;
import nl.bos.gtd_server.entities.Column;
import nl.bos.gtd_server.entities.Member;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Member.class, Board.class, Column.class, Card.class);
        config.getCorsRegistry().addMapping("/**").allowedOrigins("http://localhost:8080");
    }
}