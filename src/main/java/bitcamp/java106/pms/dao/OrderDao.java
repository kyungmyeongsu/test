package bitcamp.java106.pms.dao;

import java.util.List;
import java.util.Map;

import bitcamp.java106.pms.domain.Order;

public interface OrderDao {
    int delete(Map<String,Object> params) ;
    List<Order> selectList(int no);
    int insert(Order order);
    int update(Order order);
    Order selectOne(int no);
}