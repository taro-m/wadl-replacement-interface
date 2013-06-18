package com.kii.wadl2.dom;

import java.util.List;

public interface Operation {
    Description getDescription();
    Method getMethod();
    RequestType getRequestType();
    List<ResponseType> getResponseTypes();
}
