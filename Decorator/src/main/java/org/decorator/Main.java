package org.decorator;

import org.decorator.domain.Operation;
import org.decorator.domain.gateways.IOperationRegister;

public class Main {
    public static void main(String[] args) {
        Operation operation=Operation.builder()
                .user("Andrés")
                .destinationCurrency("BTC")
                .originCurrency("COP")
                .amount(2.0).build();
        System.out.println("----------- previous operation -----------");
        IOperationRegister registerAccounting=new RegisterAccounting();
        registerAccounting.register(operation);

        System.out.println("----------- future operation -----------");
        IOperationRegister register2=new RegisterAccounting();
        IOperationRegister register3=new RegisterAnalytical(register2);
        IOperationRegister register4=new RegisterWithRisk(register3);
        register4.register(operation);

    }
}