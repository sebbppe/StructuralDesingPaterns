package org.decorator;

import lombok.NoArgsConstructor;
import org.decorator.domain.Operation;
import org.decorator.domain.gateways.IOperationRegister;

@NoArgsConstructor
public class RegisterAccounting implements IOperationRegister {
    @Override
    public void register(Operation operation) {
        System.out.println("Operation, "+operation+", was recorded in the accounting area");
    }
}
