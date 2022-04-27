package com.nam89999.springproject01.repository;


import com.nam89999.springproject01.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {//Service에서 레포지토리 부모인 Jpa 안으로 들어가서 findbyId라는 함수를 사용한다)
	
	List<Member> findByName(String name);// 이름은 돔명이인이 있을수 있으니깐 List로 받아온다.

	Member update(Member member);

}
