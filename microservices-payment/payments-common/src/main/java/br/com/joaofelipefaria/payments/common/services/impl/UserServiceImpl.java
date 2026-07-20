package br.com.joaofelipefaria.payments.common.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.joaofelipefaria.payments.common.dto.UserDTO;
import br.com.joaofelipefaria.payments.common.entities.User;
import br.com.joaofelipefaria.payments.common.repository.UserRepository;
import br.com.joaofelipefaria.payments.common.services.UserService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDTO create(UserDTO dto) {
        User user = User.builder()
                .name(dto.name())
                .role(dto.role())
                .build();

        return toDto(userRepository.save(user));
    }

    @Override
    @Transactional(readOnly = true)
    public UserDTO findById(Long id) {
        return userRepository.findById(id)
                .map(this::toDto)
                .orElseThrow(() -> new IllegalArgumentException("User not found: " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        return userRepository.findAll().stream()
                .map(this::toDto)
                .toList();
    }

    @Override
    @Transactional
    public void delete(Long id) {
        if (!userRepository.existsById(id)) {
            throw new IllegalArgumentException("User not found: " + id);
        }

        userRepository.deleteById(id);
    }

    private UserDTO toDto(User user) {
        return new UserDTO(user.getId(), user.getName(), user.getRole());
    }
}
