package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.repository;

import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.domain.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
