package com.barbosa.loans.controller.dto;

import com.barbosa.loans.domain.LoanType;

public record LoanResponse(LoanType type, Double interestRate) {
}
