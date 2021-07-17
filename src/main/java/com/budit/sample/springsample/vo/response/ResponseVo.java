package com.budit.sample.springsample.vo.response;

import lombok.Data;

import java.util.List;

@Data
public class ResponseVo<T> {
    private String respCode;
    private String respMsg;
    private T data;
    private int cnt;

    public void setData(T data) {
        if (data instanceof List) {
            this.cnt = ((List<?>) data).size();
        }
        this.data = data;
    }
}
