package com.challenge.market.member.domain;

import com.challenge.market.member.dto.SignUpRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.UniqueConstraint;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@NoArgsConstructor
public class Member {

    @Id @GeneratedValue
    private Long Id;
    private String name;
    private String pw;

    public Member(Long id, String name, String pw) {
        Id = id;
        this.name = name;
        this.pw = pw;
    }

    public static Member toMember(SignUpRequest signUpRequest){
        return Member.builder().name(signUpRequest.getName())
                .pw(signUpRequest.getName())
                .build();

    } 
}
