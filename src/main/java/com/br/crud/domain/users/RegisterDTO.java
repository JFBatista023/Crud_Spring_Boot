package com.br.crud.domain.users;

public record RegisterDTO(String login, String password, UserRole role) {
}
