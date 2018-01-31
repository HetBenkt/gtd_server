package nl.bos.gtd.server.repositories;

import nl.bos.gtd.server.entities.Column;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SuppressWarnings("unused")
public interface IColumnRepository extends CrudRepository<Column, Long> {
    List<Column> findByBoardId(@Param("id") Long id);

    @Query("SELECT col FROM Column col WHERE col.id = :id")
    List<Column> find(@Param("id") Long id);
}
