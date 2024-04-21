package org.banquito.adapter;

import lombok.NoArgsConstructor;
import lombok.ToString;
import org.banquito.adapter.domain.ABC2024;

import java.util.Arrays;
import java.util.Date;
@ToString
@NoArgsConstructor
public class Input2024 {

    public ABC2024 getDataABC2024(){
        System.out.println("Reading data- input ABC2024");
        var input=ABC2024.builder()
                .commonParam1(new Date())
                .commonParam2("common param 2")
                .commonParam3(Arrays.asList("p1","p2","p3"))
                .commonParam4(Arrays.asList("o1","o2","o3"))
                .nonCommonParam12005(2)
                .nonCommonParam22005("param2")
                .nonCommonParam32005("param3")
                .nonCommonParam12010(3)
                .nonCommonParam22010("nparam2")
                .nonCommonParam32010("nparam3")
                .build();
        System.out.println("ABC2024 Input read");
        System.out.println(input);
        return input;
    }
}
