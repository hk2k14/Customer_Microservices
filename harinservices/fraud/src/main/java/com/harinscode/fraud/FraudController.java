package com.harinscode.fraud;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {

    public final FraudCheckService fraudCheckService;

    // public FraudController(FraudCheckService fraudCheckService){
    //     this.fraudCheckService=fraudCheckService;
    // }


    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster( 
            @PathVariable("customerId") Integer customerId){ 

                boolean isFradulentCustomer = fraudCheckService.isFradulentCustomer(customerId);

                log.info("fraud check for customer {}",customerId);
                return new FraudCheckResponse(isFradulentCustomer);

    }

}
