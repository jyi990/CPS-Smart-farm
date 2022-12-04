package com.gachon.smartfarmforcps;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

//Data access object
@Dao
public interface UserDao {

    @Insert //삽입
    void insertUser(User user);

    @Update //수정
    void updateUser(User user);

    @Delete //삭제
    void deleteUser(User user);

    //조회 쿼리
    @Query("SELECT * FROM User")
    List<User> getUserAll();
}
