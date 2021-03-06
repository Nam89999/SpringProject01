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

    
    //이건 뭐지
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
        	member.setPassword(signUpDTO.getPassword());//password 정확한 의미 (DTO)란?
            member.setName(signUpDTO.getName());//name
        	member.setEmail(signUpDTO.getEmail());//email
        	
        	Member savedMember =  memberRepository.save(member); /*DB 저장,save하면 pk 값이 없으면 insert, 있으면 update*/

        	if(savedMember!=null)//savedMember가 null인치 체크
        	{     
                return ResultCode.Success.result();/*질문 입력변수로 members가 들어가면 뭐?*/
        	}else {
                return ResultCode.DBError.result();
        	}
        		
        	//null이라면 회원가입에 실패했다는 결과 return
        	//null이 아니라면 회원가입에 성공했다는 결과 return
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }
    
    
    
    
    
      public Result updateMember(SignUpDTO signUpDTO) {
    	  
    	  return updateMember(signUpDTO.getId(),signUpDTO.getPassword(),signUpDTO.getName(),signUpDTO.getEmail());
      }
    
      
      
      //Update
      private Result updateMember(String id, String password, String name, String email) {
    	  
    	  	 /*로그인했다고 가정하면 아이디로 안찾아도 되는가?
    	  	  *try catch로 감싸야되는가?
    	  	  *  */
    	     Member member = new Member();
    	     member.setId(id);
    	     member.setPassword(password);
    	     member.setName(name);
    	     member.setEmail(email);
    	     
    	     
         	Member updateMember =  memberRepository.update(member); 
    	    
         	if(updateMember!=null) {
         		
         		return ResultCode.Success.result();
         	}else {
         		
         		return ResultCode.DBError.result();
         	}
    	 }

    	  
      }
 

