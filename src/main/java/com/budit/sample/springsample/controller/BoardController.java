package com.budit.sample.springsample.controller;

import com.budit.sample.springsample.service.BoardService;
import com.budit.sample.springsample.vo.param.BoardParam;
import com.budit.sample.springsample.vo.response.BoardVo;
import com.budit.sample.springsample.vo.response.ResponseVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
