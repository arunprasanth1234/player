/*
 * You can use the following import statements
 * 
 * import org.springframework.web.bind.annotation.*;
 * import java.util.ArrayList;
 * 
 */

// Write your code here.
package com.example.player;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.*;
import com.example.player.PlayerService;

@RestController
public class PlayerController {
    PlayerService playerservice = new PlayerService();

    @GetMapping("/players")
    public ArrayList<Player> getPlayers() {
        return playerservice.getPlayers();
    }

    @PostMapping("/players")
    public Player addPlayer(@RequestBody Player player) {
        return playerservice.addPlayer(player);
    }

    @GetMapping("/players/{playerId}")
    public Player getPlayerById(@PathVariable("playerId") int playerId) {
        return playerservice.getPlayerById(playerId);
    }

    @PutMapping("/players/{playerId}")
    public Player updatePlayer(@PathVariable("playerId") int playerId, @RequestBody Player player) {
        return playerservice.updatePlayer(playerId, player);
    }

    @DeleteMapping("/players/{playerId}")
    public void deletePlayer(@PathVariable("playerId") int playerId) {
        playerservice.deletePlayer(playerId);
    }

}