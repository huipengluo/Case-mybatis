package com.peng.test;
import com.peng.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class test1 {

    @Test
    public void test1() {
        //全局配置文件
        String resource = "mybatis-config.xml";

        InputStream inputStream = null;
        SqlSessionFactory sqlSessionFactory = null;
        SqlSession sqlSession = null;

        try {
            inputStream= Resources.getResourceAsStream(resource);
            sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
            sqlSession=sqlSessionFactory.openSession();

            Employee employee=sqlSession.selectOne("org.mybatis.helloworld.EmployeeMapper.selectEmployee\", 1");

            System.out.println(employee);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            sqlSession.close();
        }

    }
}
