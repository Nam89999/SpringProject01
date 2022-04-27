package com.nam89999.springproject01.service;

import com.nam89999.springproject01.common.Result;
import com.nam89999.springproject01.common.ResultCode;
import com.nam89999.springproject01.entity.Board;
import com.nam89999.springproject01.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
	
    @Autowired
    private BoardRepository boardRepository;

    public Result<List<Board>> getBoards() {
        try {
            List<Board> boards = boardRepository.findAll();
            return ResultCode.Success.result(boards);
        } catch (Exception e) {
            return ResultCode.DBError.result();
        }
    }

}
