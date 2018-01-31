package nl.bos.gtd.server.repositories;

import nl.bos.gtd.server.entities.Member;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

@SuppressWarnings("unused")
public interface IMemberRepository extends CrudRepository<Member, Long> {
    List<Member> findByNicknameIgnoreCaseOrderByIdAsc(@Param("nickname") String nickname);
    List<Member> findByFirstNameAndLastName(@Param("firstName") String firstName, @Param("lastName") String lastName);
    Member findFirstByOrderByLastNameAsc();
    Member findTopByOrderByNicknameDesc();
    List<Member> findFirst10ByLastName(@Param("lastName") String lastName);
    List<Member> findTop10ByLastName(@Param("lastName") String lastName);
    List<Member> findByNicknameStartingWith(@Param("nickname") String nickname);
}
