package com.mdt.base.domain.usecase;

import reactor.core.publisher.Mono;

public interface GenerateSystemPropertiesUseCase {

  Mono<String> generateCurrentGuid();
}
