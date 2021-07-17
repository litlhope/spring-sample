package com.budit.sample.springsample.service;

import com.budit.sample.springsample.model.Board;
import com.budit.sample.springsample.repository.BoardRepository;
import com.budit.sample.springsample.vo.param.BoardParam;
import com.budit.sample.springsample.vo.response.BoardVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Slf4j
@RequiredArgsConstructor
@Service
public class BoardService {
    private final BoardRepository boardRepository;
    private final ModelMapper mapper;

    // Insert
    public BoardVo save(BoardParam param) {
        Board board = boardRepository.save(mapper.map(param, Board.class));
        return mapper.map(board, BoardVo.class);
    }

    // Update
    public BoardVo save(BoardVo vo) {
        Board board = boardRepository.save(mapper.map(vo, Board.class));
        return mapper.map(board, BoardVo.class);
    }

    public int delete(long id) {
        try {
            boardRepository.deleteById(id);
        } catch (Exception ex) {
            log.warn("게시글 삭제 실패", ex);
            return 0;
        }
        return 1;
    }

    public List<BoardVo> getAll() {
        List<Board> list = boardRepository.findAll();
        return list.stream().map(e -> mapper.map(e, BoardVo.class)).collect(Collectors.toList());
    }

    public BoardVo get(long id) {
        Board board = boardRepository.getById(id);
        return mapper.map(board, BoardVo.class);
    }
}
