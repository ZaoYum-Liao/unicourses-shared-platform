package com.ourTeam.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ourTeam.common.pojo.EasyUIDataGrid;
import com.ourTeam.manager.dao.CourseInfoMapper;
import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.manager.pojo.CourseInfoExample;
import com.ourTeam.portal.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hcoly1
 * @create 2019-03-05-14:12
 */
@Service("courseServiceImpl")
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseInfoMapper courseInfoMapper;

    /**
     * 根据页数和行数获取当前页需要显示的数据
     * @param page
     * @param rows
     * @return
     */
    @Override
    public EasyUIDataGrid getCourseList(int page, int rows) {

        //设置分页信息
        PageHelper.startPage(page, rows);
        //执行查询
        CourseInfoExample example= new CourseInfoExample();
        List<CourseInfo> courseInfoList = courseInfoMapper.selectByExample(example);
        System.out.println(courseInfoList);
        PageInfo<CourseInfo> pageInfo = new PageInfo<CourseInfo>(courseInfoList);

        //创建一个返回值对象
        EasyUIDataGrid result = new EasyUIDataGrid();

        //设置总数据数
        result.setTotal(pageInfo.getTotal());
        //设置数据
        result.setRows(courseInfoList);

        return result;
    }
}
