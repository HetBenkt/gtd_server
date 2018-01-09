package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICardRepository extends CrudRepository<Card, Long> {
    List<Card> findByColumnId(@Param("id") Long id);
}
