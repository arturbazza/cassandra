package org.fundatec.cassandra.controller;

import org.fundatec.cassandra.model.PopDivas;
import org.fundatec.cassandra.service.PopDivasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/api/divas")
public class PopDivasController {

    @Autowired
    private PopDivasService popDivaService;

    @GetMapping
    public ResponseEntity<List<PopDivas>> getAllDivas() {
        List<PopDivas> divas = popDivaService.getAllDivas();
        return ResponseEntity.ok(divas);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PopDivas> getDivaById(@PathVariable UUID id) {
        Optional<PopDivas> diva = popDivaService.getDivaById(id);
        return diva.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<PopDivas> addDiva(@RequestBody PopDivas popDiva) {
        PopDivas savedDiva = popDivaService.addDiva(popDiva);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedDiva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDiva(@PathVariable UUID id) {
        popDivaService.deleteDiva(id);
        return ResponseEntity.noContent().build();
    }
}
