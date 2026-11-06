package br.com.senac.buscamor.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.senac.buscamor.model.Motel;

public interface MotelRepository extends JpaRepository<Motel, Long> {
}
