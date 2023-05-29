package com.JavaSpringEssential.services;

import com.JavaSpringEssential.entities.Order;
import org.springframework.stereotype.Service;


@Service
public class OrderService {

    private final ShippingService shippingService;

    public OrderService(ShippingService shippingService) {
        this.shippingService = shippingService;
    }

    public Double total(Order order){
        var basic = order.getBasic();
        var shipping = shippingService.shipmet(order);
        var discount = order.getDiscount()/100;

        return  basic - basic*discount + shipping;
    }
}
