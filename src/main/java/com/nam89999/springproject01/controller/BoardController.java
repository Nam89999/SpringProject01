package com.nam89999.springproject01.controller;

import com.nam89999.springproject01.DTO.LoginDTO;
import com.nam89999.springproject01.DTO.SignUpDTO;
import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.entity.Board;
import com.nam89999.springproject01.entity.Member;
import com.nam89999.springproject01.service.BoardService;
import com.nam89999.springproject01.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class BoardController extends AbstractController {

    @Autowired
    private BoardService boardSerivce;

    @GetMapping("/boards")
    @ResponseBody
    public Map<String, Object> boards() {
        Result<List<Board>> boards = boardSerivce.getBoards();
        return return2Map(boards);
    }
    
    
    //한 유저의 아이디를 이용하여 해당 유저가 쓴 게시갈 모두 가져오기
    
    
    
    //특정 번호 게시글 가져오기
    
    //좋아요 늘리기
    
    //게시물 쓰기(사람 아이디, title, content)
    
    


}
