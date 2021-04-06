package com.example.eurekadiscover;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/Cart")
public class CartRestController {
	@GetMapping("/getCartData")
	public String getCartData() {
		return "this is the data from the cart";
	}

}
