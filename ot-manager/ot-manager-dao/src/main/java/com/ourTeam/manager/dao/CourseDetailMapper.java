package com.ourTeam.manager.dao;

import com.ourTeam.manager.pojo.CourseDetail;
import com.ourTeam.manager.pojo.CourseDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CourseDetailMapper {
    long countByExample(CourseDetailExample example);

    int deleteByExample(CourseDetailExample example);

    int deleteByPrimaryKey(String courCode);

    int insert(CourseDetail record);

    int insertSelective(CourseDetail record);

    List<CourseDetail> selectByExample(CourseDetailExample example);

    CourseDetail selectByPrimaryKey(String courCode);

    int updateByExampleSelective(@Param("record") CourseDetail record, @Param("example") CourseDetailExample example);

    int updateByExample(@Param("record") CourseDetail record, @Param("example") CourseDetailExample example);

    int updateByPrimaryKeySelective(CourseDetail record);

    int updateByPrimaryKey(CourseDetail record);
}