package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Column;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

public class IColumnRepositoryImpl implements IColumnRepositoryCustom {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Column> findByAVeryComplicatedQuery(Long id, String name, String address) {
        return null;
    }
}
