package com.moveon.personalweb.service.diary;

import com.moveon.personalweb.dao.diary.DiaryDao;
import com.moveon.personalweb.entity.diary.Diary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @ClassName DiaryService
 * @Description TODO
 * @Author Moveon
 * @Date 2021/12/18 23:45
 * @Version 1.0
 **/
@Service
public class DiaryService {

    @Autowired
    private DiaryDao diaryDao;

    public int writeDiary(Diary diary) {
        return diaryDao.writeDiary(diary);
    }

    public List<Diary> getUserDiary(String userId) {
        return diaryDao.getUserDiary(userId);
    }
}
