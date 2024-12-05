package ma.smart.smartservicehub.controller;

import lombok.RequiredArgsConstructor;
import ma.smart.smartservicehub.dto.response.UserResponseDto;
import ma.smart.smartservicehub.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/all")
    public Mono<Page<UserResponseDto>> getAllUsers(
            @RequestParam(defaultValue = "0") Long page,
            @RequestParam(defaultValue = "10") Long size,
            @RequestParam(defaultValue = "id") String sortBy,
            @RequestParam(defaultValue = "asc") String order) {
        Sort.Direction direction = "desc".equalsIgnoreCase(order) ? Sort.Direction.DESC : Sort.Direction.ASC;
        Pageable pageable = PageRequest.of(page.intValue(), size.intValue(), Sort.by(direction, sortBy));
        return userService.getAllUsers(pageable);
    }
}
