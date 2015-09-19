package com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao;

import com.copypasteproductions.game.socialchallengegame.domain.game.domain.GameLobby;

public interface GameLobbyDao {

	public GameLobby getGameLobbyById(int Id);
	
	public GameLobby updateGameLobby(GameLobby lobby);
	
	public GameLobby deleteGameLobbyById(int Id);
	
	public GameLobby createGameLobby(GameLobby lobby);
	
	
}
