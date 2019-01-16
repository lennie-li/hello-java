package com.lennie.cse.repositoryImpl;

import com.lennie.cse.model.Information;
import com.lennie.cse.repository.InformationDAO;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static com.lennie.cse.common.MyUtils.getDataSource;

@Repository("InformationDAOImpl")
public class InformationDAOImpl implements InformationDAO {
    @Override
    public List<Information> findAll() throws SQLException {
        QueryRunner queryRunner = new QueryRunner(getDataSource());
        List<Information> informationList = queryRunner.query("select * from information_release", new ResultSetHandler<List<Information>>() {
            public List<Information> handle(ResultSet resultSet) throws SQLException {
                List<Information> informationList = new ArrayList<Information>();
                Information information = new Information();
                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String title = resultSet.getString("title");
                    String content = resultSet.getString("content");
                    String creater = resultSet.getString("creater");
                    Date datetime = resultSet.getDate("datetime");
                    information.setContent(content);
                    information.setId(id);
                    information.setTitle(title);
                    information.setCreater(creater);
                    information.setDatetime(datetime);
                    informationList.add(information);
                }
                return informationList;
            }
        });
        return informationList;
    }

    @Override
    public int update() {
        return 0;
    }

    @Override
    public int insert() {
        return 0;
    }

    @Override
    public int delete() {
        return 0;
    }
}