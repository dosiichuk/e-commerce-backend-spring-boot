package com.ecommerce.eshop.service;


import com.ecommerce.eshop.dto.PaymentInfo;
import com.ecommerce.eshop.dto.Purchase;
import com.ecommerce.eshop.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
