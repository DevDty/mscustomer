package NTTDATA.mscustomer_bank.repository;

import NTTDATA.mscustomer_bank.model.Customer;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface CustomerRepository extends ReactiveMongoRepository<Customer, String> {
    Mono<Customer> save(Customer customer);
    Mono<Customer> findById(String id);
    Flux<Customer> findAll();
    Mono<Customer> delete(String id);
}
