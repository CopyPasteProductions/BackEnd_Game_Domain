package com.copypasteproductions.game.socialchallengegame.domain.game.domain.service;

import com.copypasteproductions.game.socialchallengegame.domain.game.domain.GameLobby;
import com.copypasteproductions.game.socialchallengegame.domain.game.domain.Player;

public interface GameLobbyService {
	
	public void createLobby(String Name, Player owner);
	
	public void addPlayerToLobby(int lobbyId, Player p);
	
	public void deleteLobby(int lobbyId);

	public GameLobby getGameLobby(int playerId);
}
