// 업무로직 구현체 - 고객사 마다 다른 구현을 할 수 있다.
package bitcamp.java106.pms.service.impl;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import bitcamp.java106.pms.dao.OrderDao;
import bitcamp.java106.pms.domain.Order;
import bitcamp.java106.pms.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {
    
    OrderDao orderDao;
    
    public OrderServiceImpl(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
    
    @Override
    public List<Order> list(int no) {
        return orderDao.selectList(no);
    }
    
    @Override
    public Order get(int no) {
        return orderDao.selectOne(no);
    }
    
    @Override
    public int add(Order order) {
        return orderDao.insert(order);
    }
    
    @Override
    public int update(Order order) {
        return orderDao.update(order);
    }
    
    @Override
    public int delete(int no, int wsano) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("memno", no);
        params.put("wsano", wsano);
        return orderDao.delete(params);
    }
}