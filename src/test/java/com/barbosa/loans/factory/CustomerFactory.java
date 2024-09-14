package com.barbosa.loans.factory;

import com.barbosa.loans.domain.Customer;

public class CustomerFactory {

    public static Customer build(){
        return  new Customer(25, "123.456.789-00", "Adriano", 5000.00, "SP");
    }

    public static Customer build(Double income){
        return  new Customer(25, "123.456.789-00", "Adriano", income, "SP");
    }
}

