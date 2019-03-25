package com.ourTeam;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ourTeam.manager.dao.CourseInfoMapper;
import com.ourTeam.manager.pojo.CourseInfo;
import com.ourTeam.manager.pojo.CourseInfoExample;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class PageHelperTest {
    @Test
    public void test(){
        //初始化spring容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring/spring-dao.xml");
        //从容器中获取Mapper代理对象
        CourseInfoMapper itemMapper = applicationContext.getBean(CourseInfoMapper.class);
        //执行sql语句之前设置分页信息使用pageHelper的startPage方法
        PageHelper.startPage(1,10);
        //执行查询
        CourseInfoExample  example = new CourseInfoExample();
        List<CourseInfo> list = itemMapper.selectByExample(example);
        System.out.println(list);
        //取分页信息，pageInfo，总记录数，总页数，当前页码等
        PageInfo<CourseInfo> pageInfo = new PageInfo<>(list);
        System.out.println(list.getClass());
        System.out.println(pageInfo.getTotal());
        System.out.println(pageInfo.getPages());
        System.out.println(list.size());
    }

}
