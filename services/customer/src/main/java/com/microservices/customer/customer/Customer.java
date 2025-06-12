package com.microservices.customer.customer;

import jakarta.persistence.*;
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
    @OneToOne(cascade = CascadeType.ALL)
    private Addres addres;
}
