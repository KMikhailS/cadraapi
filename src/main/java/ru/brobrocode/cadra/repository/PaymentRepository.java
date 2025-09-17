package ru.brobrocode.cadra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.brobrocode.cadra.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, String> {

}
