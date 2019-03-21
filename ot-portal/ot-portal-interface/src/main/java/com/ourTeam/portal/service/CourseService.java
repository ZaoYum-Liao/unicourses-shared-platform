package com.ourTeam.portal.service;

import com.ourTeam.common.pojo.EasyUIDataGrid;

/**
 * @author hcoly1
 * @create 2019-03-05-14:02
 */
public interface CourseService {
      // 根据页码和条数获取课程列表
      EasyUIDataGrid getCourseList(int page, int rows);
}
