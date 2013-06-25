package com.kii.wadl2.dom;

import java.util.List;

public interface ResponseType {
    Description getDescription();
    int getStatusCode();
    List<Header> getHeaders();
    String getContentType();
    ContentBody getContentBody();
}
