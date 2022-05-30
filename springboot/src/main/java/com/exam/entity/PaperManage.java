package com.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PaperManage {
    private Integer paperId;

    private Integer questionType;

    private Integer questionId;


    public PaperManage(Integer paperId, int i, Integer number) {
        this.paperId=paperId;
        this.questionType=i;
        this.questionId=number;
    }
}