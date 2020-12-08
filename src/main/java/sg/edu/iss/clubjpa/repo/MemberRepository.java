package sg.edu.iss.clubjpa.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import sg.edu.iss.clubjpa.domain.Member;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Integer> {

    @Query("SELECT m FROM Member m WHERE m.firstName = :firstName")
    List<Member> findMemberByFirstName(@Param("firstName") String firstName);

}
