package ro.rarom.varianteApp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ro.rarom.varianteApp.entity.carosier.CarosierEntity;
import ro.rarom.varianteApp.exception.ResourceNotFoundException;
import ro.rarom.varianteApp.service.CarosierService;

import java.util.List;

@RestController
@RequestMapping("carosiere")
@RequiredArgsConstructor
public class CarosierController {

  private final CarosierService carosierService;

  @GetMapping
  List<CarosierEntity> getAll() {
    return carosierService.getAll();
  }

  @GetMapping("{carosierId}")
  CarosierEntity getCarosierById(@PathVariable int carosierId) {
    return carosierService.getCarosierById(carosierId)
      .orElseThrow(() -> new ResourceNotFoundException("Could not find carosier with id " + carosierId));
  }

  @PostMapping
  CarosierEntity addCarosier(@RequestBody CarosierEntity carosier) {
    return carosierService.addCarosier(carosier);
  }

  @DeleteMapping("{carosierId}")
  CarosierEntity deleteCarosierById(@PathVariable int carosierId) {
    return carosierService.deleteCarosierById(carosierId);
  }

}
