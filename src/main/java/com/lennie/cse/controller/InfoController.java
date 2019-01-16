package com.lennie.cse.controller;

import com.lennie.cse.model.Information;
import com.lennie.cse.service.InfoService;
import org.apache.servicecomb.provider.pojo.RpcSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@RpcSchema(schemaId = "sale")
@Controller
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoService infoService;

    @GetMapping("/getInfoList")
    @ResponseBody
    public ResponseEntity<List<Information>> getInfoList() throws SQLException, IOException {
        List<Information> informationList = infoService.findAll();
        return new ResponseEntity<List<Information>>(informationList, HttpStatus.OK);
    }

    @GetMapping("/addInfo")
    @ResponseBody
    public ResponseEntity<String> addInfo() throws SQLException, IOException {
        int res = infoService.insert();
        if(res > 0){
            return new ResponseEntity<String>("success", HttpStatus.OK);
        }
        return new ResponseEntity<String>("fail", HttpStatus.FAILED_DEPENDENCY);
    }
}