package com.lennie.cse.repository;

import com.lennie.cse.model.Information;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface InformationDAO {
    List<Information> findAll() throws SQLException, IOException;
    int update();
    int insert() throws IOException;
    int delete();
}
