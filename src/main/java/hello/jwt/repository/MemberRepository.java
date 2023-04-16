package hello.jwt.repository;

import hello.jwt.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    @Query("select m from Member m")
    List<Member> findAll();

    @Query("select m from Member m where m.id = :id")
    Member findById(@Param("id") Long id);
}
