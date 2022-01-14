package com.harincode.customer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
@Entity
public class Customer {

    @Id
    // @SequenceGenerator(
    //     name = "customer_id_sequence",
    //     sequenceName = "customer_id_sequence"

    // )
    @GeneratedValue(
        strategy = GenerationType.AUTO
        // generator = "customer_id_sequence"
    )
    private Integer id;
    private String firstName;
    private String lastName;
    private String email;


}
