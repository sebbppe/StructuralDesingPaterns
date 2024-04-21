package org.decorator.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder(toBuilder = true)
public class Operation {
    private String user;
    private String originCurrency;
    private String destinationCurrency;
    private Double amount;
    private Double risk;
}
