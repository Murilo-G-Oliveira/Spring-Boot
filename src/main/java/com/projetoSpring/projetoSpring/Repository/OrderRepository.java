package com.projetoSpring.projetoSpring.Repository;

import com.projetoSpring.projetoSpring.Entidades.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
