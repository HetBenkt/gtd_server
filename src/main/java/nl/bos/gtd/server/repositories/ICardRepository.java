package nl.bos.gtd.server.repositories;

import nl.bos.gtd.server.entities.Card;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SuppressWarnings("unused")
public interface ICardRepository extends CrudRepository<Card, Long> {
    List<Card> findByColumnId(@Param("id") Long id);
}
