package com.moveon.personalweb.dao.diary;

import com.moveon.personalweb.entity.diary.Diary;
import com.moveon.personalweb.entity.user.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName DiaryDao
 * @Description TODO
 * @Author Moveon
 * @Date 2021/12/18 23:40
 * @Version 1.0
 **/
@Mapper
public interface DiaryDao {

    /**
     * 写入日记操作
     * @param diary
     * @return
     */
    public int writeDiary(Diary diary);

    /**
     * 通过用户id获取用户的日记列表
     * @param userId
     * @return
     */
    public List<Diary> getUserDiary(String userId);
}
