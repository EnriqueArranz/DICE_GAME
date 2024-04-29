package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.services;

import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.domain.Player;
import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.exceptions.NotFoundException;
import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {

    public void savePlayer(Player player);
    public List<Player> findAllPlayers();
    public Player findPlayer(long id) throws NotFoundException;
    public void deletePlayer(long id) throws NotFoundException;
    public void updatePlayer(Player player);
    public PlayerDTO playerConverter(Player player);
}
