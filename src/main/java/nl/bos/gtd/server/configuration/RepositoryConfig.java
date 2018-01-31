package nl.bos.gtd.server.configuration;

import nl.bos.gtd.server.entities.Card;
import nl.bos.gtd.server.entities.Member;
import nl.bos.gtd.server.entities.Board;
import nl.bos.gtd.server.entities.Column;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

@Configuration
public class RepositoryConfig extends RepositoryRestConfigurerAdapter {
    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Member.class, Board.class, Column.class, Card.class);
        config.getCorsRegistry()
                .addMapping("/**")
                .allowedOrigins("http://localhost:8080").allowedMethods("PUT", "POST", "GET", "OPTIONS", "DELETE", "PATCH", "HEAD");
    }
}