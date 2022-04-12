package com.nam89999.springproject01.controller;

import com.nam89999.springproject01.common.Result;

import java.util.HashMap;
import java.util.Map;

public class AbstractController {

    protected Map<String, Object> return2Map(Result reuslt) {
        Map<String, Object> map = new HashMap<>();
        map.put("rtnCd", reuslt.getResultCode().getRtnCd());
        map.put("rtnMsg", reuslt.getResultCode().getRtnMsg());
        map.put("rtnObj", reuslt.getResultObject());
        return map;
    }

}
