package br.com.senac.buscamor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.buscamor.model.Reserva;

public interface ReservaRepository extends JpaRepository<Reserva, Long> {
}
