package com.mdt.base.infrastructure.receiver.web;

import com.mdt.base.domain.usecase.GenerateSystemPropertiesUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(value = "/api/v1/flow", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@Slf4j
public class FlowControllerImpl implements FlowController {

  private final GenerateSystemPropertiesUseCase systemPropertiesUsecase;

  @Override
  @GetMapping(path = "/identifier/guid", produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<ResponseEntity<String>> getCurrentGuuid() {
    log.info("Current process: " + "getCurrentGuuid");
    return systemPropertiesUsecase.generateCurrentGuid().map(result -> new ResponseEntity<>(result, HttpStatus.OK));

  }

}
