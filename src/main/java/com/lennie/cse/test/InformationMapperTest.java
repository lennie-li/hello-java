package com.lennie.cse.test;

import com.lennie.cse.model.Information;
import com.lennie.cse.repository.InformationMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class InformationMapperTest {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("sqlMapConfig.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
        InformationMapper informationMapper = session.getMapper(InformationMapper.class);
        List<Information> informationList = informationMapper.selectAll();
        for(Information information : informationList){
            System.out.println(information);
        }
    }
}
