package com.nam89999.springproject01.service;

import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.common.ResultCode;
import com.nam89999.springproject01.entity.Member;
import com.nam89999.springproject01.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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


}
