package kr.ac.kopo.mose._026example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetailRepository extends JpaRepository<Object, Long> {
    // 필요한 쿼리 메서드가 있다면 여기에 추가하세요.
}
