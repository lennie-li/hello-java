package com.lennie.cse.service;

import com.lennie.cse.model.Information;
import com.lennie.cse.repository.InformationDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@Service
public class InfoService {
    @Autowired
    @Qualifier("InformationDAOImpl2")
    InformationDAO informationDAO;

    public List<Information> findAll() throws SQLException, IOException {
        return informationDAO.findAll();
    }
    public int insert() throws SQLException, IOException {
        return informationDAO.insert();
    }
}
