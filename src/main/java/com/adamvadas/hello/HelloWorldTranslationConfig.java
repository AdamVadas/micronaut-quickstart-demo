package com.adamvadas.hello;

import io.micronaut.context.annotation.ConfigurationProperties;

import javax.validation.constraints.NotBlank;

@ConfigurationProperties("hello.world.translation")
public interface HelloWorldTranslationConfig {

    @NotBlank
    String getDe();

    @NotBlank
    String getEn();

    @NotBlank
    String getFr();

    @NotBlank
    String getHu();
}
