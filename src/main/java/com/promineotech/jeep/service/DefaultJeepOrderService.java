package com.promineotech.jeep.service;

import org.springframework.stereotype.Service;
import com.promineotech.jeep.entity.Order;
import com.promineotech.jeep.entity.OrderRequest;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DefaultJeepOrderService implements JeepOrderService {

  @Override
  public Order createOrder(OrderRequest orderRequest) {
    log.info("Test={}", orderRequest);
    return null;
  }

}
