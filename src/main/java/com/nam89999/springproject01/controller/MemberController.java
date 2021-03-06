package com.nam89999.springproject01.controller;

import com.nam89999.springproject01.DTO.LoginDTO;
import com.nam89999.springproject01.DTO.SignUpDTO;
import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.entity.Member;
import com.nam89999.springproject01.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class MemberController extends AbstractController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    @ResponseBody
    public Map<String, Object> getMembers() {
        Result<List<Member>> members = memberService.getMembers();
        return return2Map(members);
    }

    @GetMapping("/members/{id}")
    @ResponseBody
    public Map<String, Object> getMember(@PathVariable String id) {
        Result<Member> members = memberService.getMember(id);
        return return2Map(members);
    }

    @PostMapping("/login")
    @ResponseBody
    public Map<String, Object> login(@RequestBody LoginDTO loginDTO) {
        Result result = memberService.login(loginDTO);
        return return2Map(result);
    }
    
    @PostMapping("/signUp")
    @ResponseBody
    public Map<String, Object> signUp(@RequestBody SignUpDTO signUpDTO) {
        Result result = memberService.signUp(signUpDTO);//유저가 클라이언트단에서 입력한 것을 DTO 넣었고 서비스단에 signUp단에 넣어줬다.
        return return2Map(result);
    }
    
    @PostMapping("/updateMember")
    @ResponseBody
    public Map<String, Object> updateMember(@RequestBody SignUpDTO signUpDTO){
    	Result result = memberService.updateMember(signUpDTO);
		return return2Map(result) ;
    	/*return2Map이란?*/
    	
    }


}
