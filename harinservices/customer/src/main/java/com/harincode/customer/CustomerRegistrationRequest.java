package com.harincode.customer;

public record CustomerRegistrationRequest(
    String firstName,
    String lastName,
    String email) {
}
