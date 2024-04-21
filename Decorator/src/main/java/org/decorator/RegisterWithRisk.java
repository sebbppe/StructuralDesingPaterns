package org.decorator;

import org.decorator.domain.Operation;
import org.decorator.domain.gateways.IOperationRegister;

public class RegisterWithRisk extends OperaionRegister{
    private static final Double FACTOR_RISK= 300.2;
    public RegisterWithRisk(IOperationRegister operationRegister) {
        super(operationRegister);
    }
    @Override
    public void register(Operation operation) {
        super.register(calculateRisk(operation));
    }
    public Operation calculateRisk(Operation operation){
        System.out.println("Calculating risk...");
        return operation.toBuilder().risk(operation.getAmount()*0.5/FACTOR_RISK).build();
    }


}
