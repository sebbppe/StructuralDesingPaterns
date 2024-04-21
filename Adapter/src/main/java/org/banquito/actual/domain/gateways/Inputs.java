package org.banquito.actual.domain.gateways;

import org.banquito.actual.domain.ABC2005;
import org.banquito.actual.domain.ABC2010;

public interface Inputs {
    ABC2005 getDataABC2005();
    ABC2010 getDataABC2010();
}
