package ma.smart.smartservicehub.service;

import ma.smart.smartservicehub.dto.response.UserResponseDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<Page<UserResponseDto>> getAllUsers(Pageable pageable);
}
