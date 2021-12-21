package com.moveon.personalweb.entity.diary;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @ClassName Diary
 * @Description TODO
 * @Author Moveon
 * @Date 2021/12/18 23:29
 * @Version 1.0
 **/
@Data
public class Diary implements Serializable {

    private String id;
    private String userId;
    private String diaryTitle;
    private String diaryContent;
    private String diaryAuthor;
    private String diaryDate;
    private Date createDate;
    private Date updateDate;
    private String isDeleted;
}
