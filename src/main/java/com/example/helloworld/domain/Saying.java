package com.example.helloworld.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

import static java.lang.String.format;

public class Saying {

    @JsonProperty("saying")
    public final String saying;

    public Saying(Optional<String> name) {
        String who = name.isPresent() ? name.get() : "World";
        saying = format("Hello, %s", who);
    }

}
