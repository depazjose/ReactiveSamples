package com.mdt.base.domain.usecase;

import java.util.UUID;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
public class GenerateSystemPropertiesUseCaseImpl implements GenerateSystemPropertiesUseCase {

  @Override
  public Mono<String> generateCurrentGuid() {
    return Mono.just(buildUuid().toString());
  }

  private UUID buildUuid() {
    log.info("Current process: " + "buildUuid");
    return UUID.randomUUID();
  }
  
}
