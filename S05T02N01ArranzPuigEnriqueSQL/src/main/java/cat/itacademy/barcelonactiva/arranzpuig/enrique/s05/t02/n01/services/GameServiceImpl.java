package cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.services;

import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.domain.Game;
import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.exceptions.NotFoundException;
import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.repository.GameRepository;
import cat.itacademy.barcelonactiva.arranzpuig.enrique.s05.t02.n01.dto.GameDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService{

    @Autowired
    GameRepository gameReposirory;

    @Override
    public void saveGame(Game game) {
        gameReposirory.save(game);
    }

    @Override
    public void deleteGame(Game game) throws NotFoundException {
            gameReposirory.delete(game);

    }

    @Override
    public List<Game> findAllGames() {
        return gameReposirory.findAll();
    }

    @Override
    public Optional<Game> findGame(long id) {
        return gameReposirory.findById(id);
    }

    @Override
    public GameDTO gameConverter(Game game) {
        return new GameDTO(game.getId(), game.getDice1(),game.getDice2(), game.getPlayer().getId());
    }
}
