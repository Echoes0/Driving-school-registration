package com.ll.dsr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ll.dsr.entity.DrivingSchool;
import com.ll.dsr.entity.Instructor;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface InstructorMapper extends BaseMapper<Instructor> {
}
