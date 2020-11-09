package cl.jrios;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import cl.jrios.model.Usuario;
import cl.jrios.repo.IUsuarioRepo;

@SpringBootTest
class InicioSesionApplicationTests {

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Autowired
	private IUsuarioRepo repo;

	@Test
	public void crearUsuario() {
		Usuario us = new Usuario();
		us.setIdUsuario(2);
		us.setUsername("jose@gmail.com");
		us.setPassword(bcrypt.encode("123"));
		us.setEnabled(true);

		Usuario retorno = repo.save(us);

		assertTrue(retorno.getPassword().equalsIgnoreCase(us.getPassword()));
	}

}