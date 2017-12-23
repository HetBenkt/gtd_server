package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Board;
import nl.bos.gtd_server.entities.Column;
import org.springframework.data.repository.CrudRepository;

public interface IColumnRepository extends CrudRepository<Column, Long> {
}
