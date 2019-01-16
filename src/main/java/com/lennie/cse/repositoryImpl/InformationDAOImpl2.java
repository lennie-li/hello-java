package com.lennie.cse.repositoryImpl;

import com.lennie.cse.model.Information;
import com.lennie.cse.repository.InformationDAO;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


@Repository("InformationDAOImpl2")
public class InformationDAOImpl2 implements InformationDAO {


    @Override
    public List<Information> findAll() throws SQLException, IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<Information> informations = sqlSession.selectList("user.selectAll");
        return informations;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int insert() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        Information information = new Information();
        information.setTitle("测试插入");
        information.setCreater("llw");
        information.setContent("test");
        information.setDatetime(new Date());
        information.setReceiver("llw2");
        int insert = sqlSession.insert("user.insertInfo", information);
        sqlSession.commit();
        return insert;
    }

    @Override
    public int delete() {
        return 0;
    }
}