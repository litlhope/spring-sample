package com.budit.sample.springsample.vo.response;

import lombok.Data;

@Data
public class BoardVo {
    private Long id;
    private String title;
    private String content;
    private String author;
}
