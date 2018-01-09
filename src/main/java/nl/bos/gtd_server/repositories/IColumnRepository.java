package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Column;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IColumnRepository extends CrudRepository<Column, Long>, IColumnRepositoryCustom {
    List<Column> findByBoardId(@Param("id") Long id);

    @Query("SELECT col FROM Column col WHERE col.id = :id")
    public List<Column> find(@Param("id") Long id);
}
