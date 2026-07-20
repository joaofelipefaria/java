package br.com.joaofelipefaria.payments.common.services;

import java.util.List;

import br.com.joaofelipefaria.payments.common.dto.UserDTO;

public interface UserService {

    UserDTO create(UserDTO dto);

    UserDTO findById(Long id);

    List<UserDTO> findAll();

    void delete(Long id);
}
