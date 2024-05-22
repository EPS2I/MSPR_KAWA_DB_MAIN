package com.mspr_kawa.db.main.service;

import com.mspr_kawa.db.main.model.Sale;
import com.mspr_kawa.db.main.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class OrderService {

    private final SaleRepository saleRepository;

    @Autowired
    public OrderService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    public List<Sale> getAllOrders() {
        return saleRepository.findAll();
    }

    public Sale getOrderById(UUID id) {
        Optional<Sale> optionalOrder = saleRepository.findById(id);
        return optionalOrder.orElse(null);
    }

    public Sale createOrder(Sale sale) {
        sale.setId(null);
        return saleRepository.save(sale);
    }

    public Sale updateOrder(UUID id, Sale sale) {
        Optional<Sale> optionalOrder = saleRepository.findById(id);
        if (optionalOrder.isPresent()) {
            Sale existingSale = optionalOrder.get();
            if (existingSale.getId().equals(sale.getId())) {
                return saleRepository.save(sale);
            }
        }
        return null;
    }

    public boolean deleteOrder(UUID id) {
        Optional<Sale> optionalOrder = saleRepository.findById(id);
        if (optionalOrder.isPresent()) {
            saleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

