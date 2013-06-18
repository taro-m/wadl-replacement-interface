package com.kii.wadl2.dom;

import java.util.List;

public interface RequestType {
    Description getDescription();
    List<Header> getHeaders();
    String getContentType();
    ContentBody getContentBody();
}
