package ma.smart.smartservicehub.service.implementation;

import lombok.RequiredArgsConstructor;
import ma.smart.smartservicehub.dto.response.UserResponseDto;
import ma.smart.smartservicehub.repository.UserRepository;
import ma.smart.smartservicehub.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    public Mono<Page<UserResponseDto>> getAllUsers(Pageable pageable) {
        var users = this.userRepository.findAllBy(pageable);

        return users.map(UserResponseDto::fromEntity)
                .collectList()
                .zipWith(userRepository.count())
                .map(p-> new PageImpl<>(p.getT1(), pageable, p.getT2()));

    }
}
