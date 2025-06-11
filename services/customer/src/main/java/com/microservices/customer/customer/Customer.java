package com.microservices.customer.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Customer {
    @Id
    private String id;
    private String firstname;
    private String lastname;
    private String email;
    private Addres addres;
}
