package NTTDATA.mscustomer_bank.service.Impl;

import NTTDATA.mscustomer_bank.model.Customer;
import NTTDATA.mscustomer_bank.repository.CustomerRepository;
import NTTDATA.mscustomer_bank.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository repository;

    @Override
    public Mono<Customer> save(Customer customer) {
        return repository.save(customer);
    }

    @Override
    public Mono<Customer> findById(String id) {
        return repository.findById(id);
    }

    @Override
    public Flux<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public Mono<Customer> delete(String id) {
        return repository.delete(id);
    }
}
