package com.api.junit.service;

import com.api.junit.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {

    Paciente createPaciente(Paciente paciente);

    List<Paciente> getAllPacientes();

    Optional<Paciente> getPacienteById(Long pacienteId);

    Paciente updatePaciente(Paciente paciente);

    void deletePaciente(Long pacienteId);

}

