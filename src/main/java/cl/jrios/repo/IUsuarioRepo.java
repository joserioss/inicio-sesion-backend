package cl.jrios.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.jrios.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

	Usuario findOneByUsername(String username);
}
