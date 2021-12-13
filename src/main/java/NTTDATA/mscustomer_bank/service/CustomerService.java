package NTTDATA.mscustomer_bank.service;

import NTTDATA.mscustomer_bank.model.Customer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerService {
    public Mono<Customer> save(Customer customer);
    public Mono<Customer> findById(String id);
    public Flux<Customer> findAll();
    public Mono<Customer> delete(String id);
}
