package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Column;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IColumnRepository extends CrudRepository<Column, Long> {
    List<Column> findByBoardId(@Param("id") Long id);
}
