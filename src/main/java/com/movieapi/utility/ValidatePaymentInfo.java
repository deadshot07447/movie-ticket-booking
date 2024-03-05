package com.movieapi.utility;

import com.movieapi.exception.InsufficientBalacneError;

import java.util.HashMap;
import java.util.Map;

public class ValidatePaymentInfo {

    private static Map<String,Double> paymentInfo = new HashMap<>();

    static {
        paymentInfo.put("acc1",2000.0);
        paymentInfo.put("acc2", 1500.0);
        paymentInfo.put("acc3", 500.0);

    }

    public static boolean validateCreditLimit(String accNo, Double paidAmount){
        if (paidAmount > paymentInfo.get(accNo)){
            throw new InsufficientBalacneError("Not enough Money in Account");
        }else
            return true;
    }
}
