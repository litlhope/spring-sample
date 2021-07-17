package com.budit.sample.springsample.controller;

import com.budit.sample.springsample.service.BoardService;
import com.budit.sample.springsample.vo.param.BoardParam;
import com.budit.sample.springsample.vo.response.BoardVo;
import com.budit.sample.springsample.vo.response.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@Api("게시글 처리 API V1")
@RequestMapping("/board")
public class BoardController {
    private final BoardService boardService;

    @ApiOperation(value = "게시글 등록", notes = "<big>게시글</big>을 등록한다.")
    @PostMapping("")
    public ResponseVo<BoardVo> addBoard(@RequestBody BoardParam param) {
        log.info("param: " + param);
        BoardVo vo = boardService.save(param);
        ResponseVo<BoardVo> resp = new ResponseVo<>();
        resp.setRespCode("0000");
        resp.setRespMsg("정상");
        resp.setData(vo);
        return resp;
    }

    @ApiOperation(value = "게시글 전체 조회", notes = "<big>게시글</big> 전체 목록을 조회한다.")
    @GetMapping("")
    public ResponseVo<List<BoardVo>> getBoardAll() {
        List<BoardVo> list = boardService.getAll();
        ResponseVo<List<BoardVo>> resp = new ResponseVo<>();
        resp.setRespCode("0000");
        resp.setRespMsg("정상");
        resp.setData(list);
        return resp;
    }

    @ApiOperation(value = "게시글 조회", notes = "<big>게시글</big>을 조회한다.")
    @GetMapping("/{id}")
    public ResponseVo<BoardVo> getBoard(@PathVariable long id) {
        log.info("id: " + id);
        BoardVo vo = boardService.get(id);
        ResponseVo<BoardVo> resp = new ResponseVo<>();
        resp.setRespCode("0000");
        resp.setRespMsg("정상");
        resp.setData(vo);
        return resp;
    }
}
