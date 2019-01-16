package com.lennie.cse;

import org.apache.servicecomb.foundation.common.utils.BeanUtils;
import org.apache.servicecomb.foundation.common.utils.Log4jUtils;

public class MainServer {
    public static void main(String[] args) throws Exception {
        Log4jUtils.init();
        BeanUtils.init();
    }
}
