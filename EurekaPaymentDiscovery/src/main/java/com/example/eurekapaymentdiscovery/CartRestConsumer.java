package com.example.eurekapaymentdiscovery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import java.util.List;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class CartRestConsumer {
	@Autowired
	private DiscoveryClient client;
	public String getCartInfo() {
		List<ServiceInstance> list = client.getInstances("CART-SERVICE");
		ServiceInstance si = list.get(0);
		String url = si.getUri()+"Cart/getCartData";
		RestTemplate rt = new RestTemplate();
		String response = rt.getForObject(url,String.class);
		return response;
	}
}
