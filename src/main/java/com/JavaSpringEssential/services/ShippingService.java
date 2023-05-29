package com.JavaSpringEssential.services;

import com.JavaSpringEssential.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public Double shipmet(Order order){
        var basic = order.getBasic();

            if (basic < 100.00) return 20.00;
            if(basic < 200.0) return 12.00;

            return 0.0;

        }
    }

