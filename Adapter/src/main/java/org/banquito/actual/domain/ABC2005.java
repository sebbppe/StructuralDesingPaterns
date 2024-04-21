package org.banquito.actual.domain;

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
public class ABC2005 {
    private Date commonParam1;
    private String commonParam2;
    private List<String> commonParam3;
    private List<String> commonParam4;
    private Integer nonCommonParam12005;
    private String nonCommonParam22005;
    private String nonCommonParam32005;
}
