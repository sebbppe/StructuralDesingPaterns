package org.decorator;

import org.decorator.domain.Operation;
import org.decorator.domain.gateways.IOperationRegister;

public class RegisterAnalytical extends OperaionRegister{
    public RegisterAnalytical(IOperationRegister operationRegister) {
        super(operationRegister);
    }
    @Override
    public void register(Operation operation) {
        super.register(operation);
        sendToAnalitic(operation);
    }
    public void sendToAnalitic(Operation operation){
        System.out.println("Operation, "+operation+", was recorded in the analytic area");
    }


}
