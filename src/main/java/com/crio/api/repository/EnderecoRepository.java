package com.crio.api.repository;

import com.crio.api.domain.Endereco.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;
@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, UUID> {
}
