package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Card;
import org.springframework.data.repository.CrudRepository;

public interface ICardRepository extends CrudRepository<Card, Long> {
}
