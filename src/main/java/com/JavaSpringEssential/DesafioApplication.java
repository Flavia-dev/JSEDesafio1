package com.JavaSpringEssential;

import com.JavaSpringEssential.entities.Order;
import com.JavaSpringEssential.services.OrderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioApplication implements CommandLineRunner {

	private  final OrderService orderService;

	public DesafioApplication(OrderService orderService) {
		this.orderService = orderService;
	}
	public static void main(String[] args) {
		SpringApplication.run(DesafioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Order order = new Order(1309, 95.90, 0.0);
		System.out.println("Pedido cõdigo " + order.getCode());
		System.out.println("Valor total: R$ "+ orderService.total(order));
	}

}
