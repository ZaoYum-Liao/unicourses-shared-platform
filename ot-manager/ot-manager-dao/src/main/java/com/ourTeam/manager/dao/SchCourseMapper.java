package com.ourTeam.manager.dao;

import com.ourTeam.manager.pojo.SchCourse;
import com.ourTeam.manager.pojo.SchCourseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SchCourseMapper {
    int countByExample(SchCourseExample example);

    int deleteByExample(SchCourseExample example);

    int deleteByPrimaryKey(String courCode);

    int insert(SchCourse record);

    int insertSelective(SchCourse record);

    List<SchCourse> selectByExample(SchCourseExample example);

    SchCourse selectByPrimaryKey(String courCode);

    int updateByExampleSelective(@Param("record") SchCourse record, @Param("example") SchCourseExample example);

    int updateByExample(@Param("record") SchCourse record, @Param("example") SchCourseExample example);

    int updateByPrimaryKeySelective(SchCourse record);

    int updateByPrimaryKey(SchCourse record);
}