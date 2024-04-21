package org.banquito.adapter;

import org.banquito.actual.domain.ABC2005;
import org.banquito.actual.domain.ABC2010;
import org.banquito.actual.domain.gateways.Inputs;
import org.banquito.adapter.domain.ABC2024;

public class Input2024Adapter implements Inputs {
    Input2024 input2024;

    public Input2024Adapter(Input2024 input2024) {
        this.input2024 = input2024;
    }

    @Override
    public ABC2005 getDataABC2005() {
        ABC2024 abc2024=input2024.getDataABC2024();
        System.out.println("2005 input is adapted");
        return ABC2005.builder()
                .commonParam1(abc2024.getCommonParam1())
                .commonParam2(abc2024.getCommonParam2())
                .commonParam3(abc2024.getCommonParam3())
                .commonParam4(abc2024.getCommonParam4())
                .nonCommonParam12005(abc2024.getNonCommonParam12005())
                .nonCommonParam22005(abc2024.getNonCommonParam22005())
                .nonCommonParam32005(abc2024.getNonCommonParam32005())
                .build();
    }

    @Override
    public ABC2010 getDataABC2010() {
        ABC2024 abc2024=input2024.getDataABC2024();
        System.out.println("2010 input is adapted");
        return ABC2010.builder()
                .commonParam1(abc2024.getCommonParam1())
                .commonParam2(abc2024.getCommonParam2())
                .commonParam3(abc2024.getCommonParam3())
                .commonParam4(abc2024.getCommonParam4())
                .nonCommonParam12010(abc2024.getNonCommonParam12010())
                .nonCommonParam22010(abc2024.getNonCommonParam22010())
                .nonCommonParam32010(abc2024.getNonCommonParam32010())
                .build();
    }
}
