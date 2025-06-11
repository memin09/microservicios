package com.microservices.customer.customer;

public record  CustomerResponse(  String id,
                                  String firstname,
                                  String lastname,
                                  String email,
                                  Addres address) {
}
