package com.pedromantis.course.repositories;

import com.pedromantis.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long>{
}
