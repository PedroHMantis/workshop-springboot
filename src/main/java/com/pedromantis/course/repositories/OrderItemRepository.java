package com.pedromantis.course.repositories;

import com.pedromantis.course.entities.OrderItem;
import com.pedromantis.course.entities.pk.OrderItemPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
