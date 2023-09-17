package com.ecommerce.eshop.dto;

import com.ecommerce.eshop.entity.Address;
import com.ecommerce.eshop.entity.Customer;
import com.ecommerce.eshop.entity.Order;
import com.ecommerce.eshop.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}

