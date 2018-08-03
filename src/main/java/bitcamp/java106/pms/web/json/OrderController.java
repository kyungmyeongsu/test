package bitcamp.java106.pms.web.json;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import bitcamp.java106.pms.domain.Order;
import bitcamp.java106.pms.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
    
    OrderService orderService;
    
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("add")
    @ResponseStatus(HttpStatus.CREATED)
    public void add(Order order) throws Exception {
        orderService.add(order);
    }
    
    @RequestMapping("delete")
    //@ResponseStatus(HttpStatus.OK) // 응답 상태 코드 값의 기본은 "200(OK)" 이다.
    public void delete(@RequestParam("no") int no,
                       @RequestParam("wsano") int wsano) throws Exception {
        orderService.delete(no, wsano);
    }
    
    @RequestMapping("list")
    public Object list(int no) {        
        return orderService.list(no);
    }
    
    @RequestMapping("update")
    @ResponseStatus(HttpStatus.OK) // 기본 값이 OK 이다. 
    public void update(Order order) throws Exception {
        orderService.update(order);
    }
    
    @RequestMapping("{no}")
    public Order view(@PathVariable int no) throws Exception {
        return orderService.get(no);
    }

}