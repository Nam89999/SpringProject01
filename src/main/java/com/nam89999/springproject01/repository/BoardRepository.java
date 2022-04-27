package com.nam89999.springproject01.repository;


import com.nam89999.springproject01.entity.Board;
import com.nam89999.springproject01.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board, Long> {//Service에서 레포지토리 부모인 Jpa 안으로 들어가서 findbyId라는 함수를 사용한다)
	

}
