package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository {
    //select m from Member m where m.name = ?
    //메소드명 만으로도 해결이 가능하다
    @Override
    Optional<Member> findByName(String name);
}
