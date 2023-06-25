package com.ll.dsr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ll.dsr.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {

    @Insert("insert into student(student_number,password) VALUES(#{id},#{password})")
    void login(@Param("id") Long id, @Param("password")String password);
}
