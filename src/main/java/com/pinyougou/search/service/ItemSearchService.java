package com.pinyougou.search.service;


import java.util.List;
import java.util.Map;

/********
 * author:Aligan
 * date2018/10/6 14:38
 * description:Aligan
 * version:1.0
 ******/


public interface ItemSearchService {

    //搜索，传过来的可能是多个值，所以需要以键值对的形式封装到一个Map里面，
    public Map<String,Object> search(Map searchMap);

    //批量化导入数据到solr；
    void importList(List list);

    void deletByGoodsId(List list);
}
