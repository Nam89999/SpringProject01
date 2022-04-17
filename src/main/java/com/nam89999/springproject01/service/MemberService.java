package com.nam89999.springproject01.service;

import com.nam89999.springproject01.DTO.LoginDTO;
import com.nam89999.springproject01.DTO.SignUpDTO;
import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.common.ResultCode;
import com.nam89999.springproject01.entity.Member;
import com.nam89999.springproject01.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MemberService {
    @Autowired
    private MemberRepository memberRepository;

    public Result<List<Member>> getMembers() {
        try {
            List<Member> members = memberRepository.findAll();
            return ResultCode.Success.result(members);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result<Member> getMember(String id) {
        try {
            Optional<Member> optionalMember = memberRepository.findById(id);
            if (optionalMember.isPresent()) {
                Member member = optionalMember.get();
                return ResultCode.Success.result(member);
            }
            return ResultCode.NOT_EXISTS.result();
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

    public Result login(LoginDTO loginDTO) {
        return login(loginDTO.getId(), loginDTO.getPassword());
    }

    public Result login(String id, String password) {
        try {
        	Optional<Member> optionalMember = memberRepository.findById(id);
            if (optionalMember.isPresent()) {
                Member member = optionalMember.get();
                if (password.equals(member.getPassword())) {
                    return ResultCode.Success.result();
                }
                return ResultCode.NOT_CORRECT_MEMBER.result();
            } else {
                return ResultCode.NOT_EXISTS.result();
            }
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }
    
    public Result signUp(SignUpDTO signUpDTO) {
        try {
        	Member member = new Member();
        	member.setId(signUpDTO.getId());
        	//passwod
        	//name
        	//email
        	
        	Member savedMember =  memberRepository.save(member);
      
        	//savedMember가 null인치 체크
        	//null이라면 회원가입에 실패했다는 결과 return
        	//null이 아니라면 회원가입에 성공했다는 결과 return
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }


}
