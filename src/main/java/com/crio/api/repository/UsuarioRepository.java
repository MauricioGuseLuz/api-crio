package com.crio.api.repository;

import com.crio.api.domain.Usuario.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, UUID>{
    //selecionar todos os usuarios.
    @Query("SELECT u FROM Usuario u")
    List<Usuario> findAllUsuario();

    //selecionar um usuario pelo seu id.
    @Query("SELECT u FROM Usuario u WHERE u.id = :id")
    Optional<Usuario> findByIdUsuario(UUID id);

//    //metodo para salvar usuario.
//    @Query("INSERT INTO Usuario(nomeCompleto, email, senha, tipo," +
//            "createAt,updateAt) VALUES(:nomeCompleto,:email,:senha,:tipo," + ":createAt,:updateAt)")
//    Usuario saveUsuario(String nomeCompleto, String email, String senha, int tipo, LocalDateTime createAt, LocalDateTime updateAt);

    //atualizar usuario
    @Query("UPDATE Usuario u SET u.nomeCompleto=:nomeCompleto," +
            "u.email=:email, u.senha=:senha, u.tipo=:tipo, u.updateAt=:updateAt WHERE u.id=:id")
    void updateUsuario(String nomeCompleto, String email, String senha, int tipo, LocalDateTime updateAt, UUID id);

    //deleter

    @Query("DELETE FROM Usuario u WHERE u.id=:id")
    void deleteUsuario(UUID id);


}
