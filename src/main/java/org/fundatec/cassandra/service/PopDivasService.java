package org.fundatec.cassandra.service;

import org.fundatec.cassandra.model.PopDivas;
import org.fundatec.cassandra.repository.PopDivasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PopDivasService {

    @Autowired
    private PopDivasRepository popDivaRepository;

    public List<PopDivas> getAllDivas() {
        return popDivaRepository.findAll();
    }

    public Optional<PopDivas> getDivaById(UUID divaId) {
        return popDivaRepository.findById(divaId);
    }

    public PopDivas addDiva(PopDivas popDiva) {
        return popDivaRepository.save(popDiva);
    }

    public void deleteDiva(UUID divaId) {
        popDivaRepository.deleteById(divaId);
    }
}
