package ua.edu.ucu.apps.flowerstore.flower.Payment;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @GetMapping("payment")
    public List<Payment> getPayments(){
        return List.of(new CreditCardPaymentStrategy(), new PayPalPaymentStrategy());
    }
}
