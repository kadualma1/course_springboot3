package com.carloseduardo.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carloseduardo.course.entities.OrderItem;
import com.carloseduardo.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
	
}
