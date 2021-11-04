package com.mdt.base.infrastructure.receiver.web;

import org.springframework.http.ResponseEntity;

import reactor.core.publisher.Mono;

public interface FlowController {

  Mono<ResponseEntity<String>> getCurrentGuuid();
}
