package com.nam89999.springproject01.controller;

import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.entity.Member;
import com.nam89999.springproject01.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

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


}
