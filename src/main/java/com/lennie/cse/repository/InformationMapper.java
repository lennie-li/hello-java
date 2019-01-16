package com.lennie.cse.repository;

import com.lennie.cse.model.Information;

import java.util.List;

public interface InformationMapper {
    //按照该规则编写，与sqlMap中的xml文件进行绑定
    //接口方法名 == information.xml中的id名
    //返回值与information.xml中的返回值类型一致
    //入参类型与information.xml中的入参类型一致
    //命名空间指定该接口
    List<Information> selectAll();
    Information selectById(Integer id);
    Information selectByName(String name);
    void insertInfo(Information information);
    void updateInfo(Information information);
    void deleteInfo(Integer id);
}
