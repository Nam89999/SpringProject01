package com.nam89999.springproject01.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Builder // 머지
@AllArgsConstructor // 머지?
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 머지?
@Entity(name = "board") // 테이블 명을 작성
public class Board {
	@Id
	private String id;
	@Column(nullable = false, length = 45)
	private String memberId;

	@Column(nullable = false, length = 45, unique = true)
	private String regttm;

	@Column(nullable = false, length = 10) // DB에는 nullable가능인데 아닌 이유
	private String view;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getRegttm() {
		return regttm;
	}

	public void setRegttm(String regttm) {
		this.regttm = regttm;
	}

	public String getView() {
		return view;
	}

	public void setView(String view) {
		this.view = view;
	}

}
