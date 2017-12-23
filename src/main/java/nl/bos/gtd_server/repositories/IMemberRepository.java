package nl.bos.gtd_server.repositories;

import nl.bos.gtd_server.entities.Member;
import org.springframework.data.repository.CrudRepository;

public interface IMemberRepository extends CrudRepository<Member, Long> {
}
