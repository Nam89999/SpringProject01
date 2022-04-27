package com.nam89999.springproject01.entity;

import lombok.*;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Builder // 머지
@AllArgsConstructor // 머지?
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 머지?
@Entity(name = "board") // 테이블 명을 작성
public class Board {
	
	@Id
	@Column(name= "id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;

	@Column(name = "regdttm")
	private LocalDateTime regttm;

	@Column(name="view") // DB에는 nullable가능인데 아닌 이유
	private int view;
	
	@Column(name="title")
	private String title;
	
	@Column(name="content")
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Member getMember() {
		return member;
	}

	public void setMember(Member member) {
		this.member = member;
	}

	public LocalDateTime getRegttm() {
		return regttm;
	}

	public void setRegttm(LocalDateTime regttm) {
		this.regttm = regttm;
	}

	public int getView() {
		return view;
	}

	public void setView(int view) {
		this.view = view;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	

}
