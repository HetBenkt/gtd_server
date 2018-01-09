package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Column;

import java.util.List;

public interface IColumnRepositoryCustom {
    List<Column> findByAVeryComplicatedQuery(Long id, String name, String address);
}
