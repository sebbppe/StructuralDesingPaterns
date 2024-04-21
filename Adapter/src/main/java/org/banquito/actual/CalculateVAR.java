package org.banquito.actual;

import org.banquito.actual.processor.ProcessVAR;
import org.banquito.adapter.Input2024;
import org.banquito.adapter.Input2024Adapter;

public class CalculateVAR {
    public static void main(String[] args) {
        Input2024 input2024=new Input2024();
        Input2024Adapter input2024Adapter= new Input2024Adapter(input2024);
        ProcessVAR processVAR=new ProcessVAR(input2024Adapter);
        processVAR.processVAR();
    }
}