package com.example.eurekapaymentdiscovery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/payment")
public class PaymentRestController {
	@Autowired
	private CartRestConsumer consumer; 
	@GetMapping("/data")
	public String getPaymentData() {
		return "FROM PAYMENT SERVICE"+ consumer.getCartInfo();
	}
}
