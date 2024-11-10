package com.projetoSpring.projetoSpring.Repository;

import com.projetoSpring.projetoSpring.Entidades.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
