package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IBoardRepository extends CrudRepository<Board, Long> {
    List<Board> findByMemberId(@Param("id") Long id);
}
