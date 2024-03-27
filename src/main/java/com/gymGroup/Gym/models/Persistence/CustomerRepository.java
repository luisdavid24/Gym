package com.gymGroup.Gym.models.Persistence;

import com.gymGroup.Gym.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
