package org.banquito.adapter.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;
@ToString
@Getter
@Setter
@Builder()
public class ABC2024 {
    private Date commonParam1;
    private String commonParam2;
    private List<String> commonParam3;
    private List<String> commonParam4;
    private Integer nonCommonParam12005;
    private String nonCommonParam22005;
    private String nonCommonParam32005;
    private Integer nonCommonParam12010;
    private String nonCommonParam22010;
    private String nonCommonParam32010;
}
