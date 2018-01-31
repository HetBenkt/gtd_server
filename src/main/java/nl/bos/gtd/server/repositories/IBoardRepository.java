package nl.bos.gtd.server.repositories;

import nl.bos.gtd.server.entities.Board;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SuppressWarnings("unused")
public interface IBoardRepository extends CrudRepository<Board, Long> {
    List<Board> findByMemberId(@Param("id") Long id);
}
