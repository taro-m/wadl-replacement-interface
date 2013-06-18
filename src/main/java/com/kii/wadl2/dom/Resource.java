package com.kii.wadl2.dom;

import java.util.List;

public interface Resource {
    Description getDescription();
    String getPath();
    List<Operation> getOperations();
}
