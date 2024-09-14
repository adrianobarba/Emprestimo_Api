package com.barbosa.loans.domain;

import com.barbosa.loans.factory.CustomerFactory;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
class CustomerTest {
    @Nested
    class isIncomeEqualOrLowerThan {
        @Test
        void shouldBeTrueWhenIncomeIsEqual(){
           var customer = CustomerFactory.build(5000.0);

           assertTrue(customer.isIncomeEqualOrLowerThan(5000.0));
        }

        @Test
        void shouldBeTrueWhenIncomeIsLowerThan(){
            var customer = CustomerFactory.build(5000.0);

            assertTrue(customer.isIncomeEqualOrLowerThan(9000.0));
        }
        @Test
        void shouldBeFalseWhenIncomeIsGreaterThanValue() {
            var customer = CustomerFactory.build(5000.0);

            assertTrue(customer.isIncomeEqualOrLowerThan(8000.0));
        }
    }

}