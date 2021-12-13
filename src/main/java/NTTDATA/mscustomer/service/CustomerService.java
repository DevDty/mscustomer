package NTTDATA.mscustomer.service;

import NTTDATA.mscustomer.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    public Mono<Customer> save(Customer customer);
    public Mono<Customer> findById(String id);
    public Flux<Customer> findAll();
    public Mono<Customer> delete(String id);
}
