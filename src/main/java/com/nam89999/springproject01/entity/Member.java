package com.nam89999.springproject01.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity(name = "member") // 테이블 명을 작성
public class Member {
    @Id
    private String id;
    @Column(nullable = false, length = 45)
    private String password;
    @Column(nullable = false, length = 45)
    private String email;
    @Column(nullable = false, length = 10)
    private String name;
}
