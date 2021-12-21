package com.moveon.personalweb.controller.diary;

import com.moveon.personalweb.entity.diary.Diary;
import com.moveon.personalweb.entity.user.User;
import com.moveon.personalweb.service.diary.DiaryService;
import com.moveon.personalweb.service.user.UserService;
import com.moveon.personalweb.util.ResultMap;
import com.moveon.personalweb.util.UUIDUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @ClassName DiaryController
 * @Description TODO
 * @Author Moveon
 * @Date 2021/12/18 23:42
 * @Version 1.0
 **/
@RestController
@RequestMapping("/diary")
public class DiaryController {

    @Autowired
    private UserService userService;
    @Autowired
    private DiaryService diaryService;

    @PostMapping("/writeDiary")
    public ResultMap writeDiary(@Param("userId") String userId, @Param("diaryTitle") String diaryTitle, @Param("diaryContent") String diaryContent, @Param("diaryAuthor") String diaryAuthor) {
        int i = 0;
        Diary diary = new Diary();
        diary.setId(UUIDUtils.createID());
        diary.setUserId(userId);
        diary.setDiaryTitle(diaryTitle);
        diary.setDiaryContent(diaryContent);
        diary.setDiaryAuthor(diaryAuthor);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String now = sdf.format(date);
        diary.setDiaryDate(now);
        diary.setCreateDate(date);
        diary.setUpdateDate(date);
        diary.setIsDeleted("00");
        i = diaryService.writeDiary(diary);
        if (i != 0) {
            return ResultMap.buildSuccessResult("成功写入日记", i);
        }
        return ResultMap.buildFailureResult("写入日记操作失败");
    }

    @GetMapping("/getUserDiary")
    public ResultMap getUserDiary(String userId) {
        List<Diary> userDiary = diaryService.getUserDiary(userId);
        return ResultMap.buildSuccessResult("获取日记成功", userDiary);
    }
}
