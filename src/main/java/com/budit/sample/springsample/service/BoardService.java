package com.budit.sample.springsample.service;

import com.budit.sample.springsample.model.Board;
import com.budit.sample.springsample.repository.BoardRepository;
import com.budit.sample.springsample.vo.param.BoardParam;
import com.budit.sample.springsample.vo.response.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final ModelMapper mapper;

    public BoardVo save(BoardParam param) {
        Board board = mapper.map(param, Board.class);
        log.info("board save: " + board);
        board = boardRepository.save(board);
        log.info("saved board: " + board);
        return mapper.map(board, BoardVo.class);
    }
}
