package org.acme.sample;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sample {

    @JsonProperty("value")
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
