package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface IBoardRepository extends CrudRepository<Board, Long> {
}
