package com.mdt.base.application.configuration;

import com.mdt.base.domain.usecase.GenerateSystemPropertiesUseCase;
import com.mdt.base.domain.usecase.GenerateSystemPropertiesUseCaseImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfig {
  

  @Bean
  public GenerateSystemPropertiesUseCase generateSystemPropertiesUseCase() {
    return new GenerateSystemPropertiesUseCaseImpl();
  }

}
