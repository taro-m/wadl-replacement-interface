package com.kii.wadl2.dom;

import java.util.List;

public interface Resource {
    String getPath();
    List<Operation> getOperations();
}
