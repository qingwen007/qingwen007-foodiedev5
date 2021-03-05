package com.imooc.mapper;

import com.imooc.my.mapper.MyMapper;
import com.imooc.pojo.Orders;
import com.imooc.pojo.vo.MyOrdersVO;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface OrdersMapperCustom extends MyMapper<Orders> {

    public List<MyOrdersVO> queryMyOrders(@Param("paramsMap") Map<String,Object> map);

    public int getMyOrderStatusCounts(@Param("paramsMap") Map<String, Object> map);

}