package ma.smart.smartservicehub.repository;

import ma.smart.smartservicehub.entity.User;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveSortingRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends ReactiveSortingRepository<User, Long> {
    Flux<User> findAllBy(Pageable pageable);
    Mono<Long> count();
}
