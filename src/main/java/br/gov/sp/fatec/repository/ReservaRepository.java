package br.gov.sp.fatec.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import br.gov.sp.fatec.model.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva, Long> {

	public List<Reserva> findByUsuarioNome(String nome);

	public List<Reserva> findByExemplarLivroNomeContainsIgnoreCase(String nome);
}