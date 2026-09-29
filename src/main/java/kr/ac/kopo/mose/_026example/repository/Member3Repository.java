package kr.ac.kopo.mose._026example.repository;

import kr.ac.kopo.mose._026example.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Entity이름과 Repository 이름이 일치해야한다.
@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {

}
