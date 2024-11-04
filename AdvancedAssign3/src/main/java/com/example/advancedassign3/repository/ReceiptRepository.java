package com.example.advancedassign3.repository;

import com.example.advancedassign3.model.Receipt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
