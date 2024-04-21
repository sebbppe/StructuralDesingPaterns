package org.banquito.actual.processor;

import lombok.NoArgsConstructor;
import org.banquito.actual.domain.ABC2005;
import org.banquito.actual.domain.ABC2010;
import org.banquito.actual.domain.gateways.Inputs;

@NoArgsConstructor
public class ProcessVAR {
    ABC2005 abc2005;
    ABC2010 abc2010;

    public ProcessVAR(Inputs inputs) {
        this.abc2005= inputs.getDataABC2005();
        this.abc2010= inputs.getDataABC2010();
    }

    public void processVAR(){
        System.out.println("The VAR was processed with data from abc2005 and abc2010");
        System.out.println(abc2005);
        System.out.println(abc2010);
    }
}
