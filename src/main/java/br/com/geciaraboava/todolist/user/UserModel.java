package br.com.geciaraboava.todolist.user;

import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data // inclui automaticamente os getters e setters
@Entity(name = "tb_users") // define o nome da tabela no banco de dados
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID") // o sistema vai gerar ao id automaticamente, no formato UUID
    private UUID ID;

    @Column(unique = true)
    private String username;
    private String name;
    private String password;

    @CreationTimestamp // informa a data e hora da criação do dado
    private LocalDateTime createdAt;

}