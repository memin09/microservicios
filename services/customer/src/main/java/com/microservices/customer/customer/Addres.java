package com.microservices.customer.customer;

import jakarta.persistence.Entity;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Addres {
    private String street;
    private String houseNumber;
    private String zipCode;

}
