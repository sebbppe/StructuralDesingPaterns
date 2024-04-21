package org.decorator;

import org.decorator.domain.Operation;
import org.decorator.domain.gateways.IOperationRegister;

public abstract class OperaionRegister implements IOperationRegister {
    IOperationRegister operationRegister;

    public OperaionRegister(IOperationRegister operationRegister) {
        this.operationRegister = operationRegister;
    }
    @Override
    public void register(Operation operation) {
        operationRegister.register(operation);
    }
}
