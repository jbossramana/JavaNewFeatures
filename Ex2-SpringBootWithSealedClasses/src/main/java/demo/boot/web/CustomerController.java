package demo.boot.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.boot.model.Customer;
import demo.boot.model.PremiumCustomer;
import demo.boot.model.RegularCustomer;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @GetMapping("/regular")
    public Customer getRegularCustomer(@RequestParam String name) {
        return new RegularCustomer(name);
    }

    @GetMapping("/premium")
    public Customer getPremiumCustomer(@RequestParam String name) {
        return new PremiumCustomer(name);
    }
}