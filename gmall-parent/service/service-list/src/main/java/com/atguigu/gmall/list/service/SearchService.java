package com.atguigu.gmall.list.service;

import java.util.Map;

public interface SearchService {

    /**
     * ๅๅๆ็ดข
     * @param searchData
     * @return
     */
    public Map<String, Object> search(Map<String,String> searchData);
}
