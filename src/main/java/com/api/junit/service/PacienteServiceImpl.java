package com.api.junit.service;


import com.api.junit.entity.Paciente;
import com.api.junit.repository.PacienteRepository;
import com.api.junit.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteServiceImpl implements PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Override
    public Paciente createPaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public List<Paciente> getAllPacientes() {
        return pacienteRepository.findAll();
    }

    @Override
    public Optional<Paciente> getPacienteById(Long pacienteId) {
        return pacienteRepository.findById(pacienteId);
    }

    @Override
    public Paciente updatePaciente(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    @Override
    public void deletePaciente(Long pacienteId) {
        pacienteRepository.deleteById(pacienteId);
    }
}
