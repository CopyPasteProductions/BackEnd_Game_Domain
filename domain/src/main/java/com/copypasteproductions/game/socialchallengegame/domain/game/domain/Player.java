package com.copypasteproductions.game.socialchallengegame.domain.game.domain;

public class Player {
	
	private int gameId;
	
	private String userId;
	
	private int player_alias;
	
	private boolean turn;
	
	private int score;

	public Player(int gameId, String userId, int player_alias, boolean turn, int score) {
		super();
		this.gameId = gameId;
		this.userId = userId;
		this.player_alias = player_alias;
		this.turn = turn;
		this.score = score;
	}

	public int getGameId() {
		return gameId;
	}

	public String getUserId() {
		return userId;
	}

	public int getPlayer_alias() {
		return player_alias;
	}

	public boolean isTurn() {
		return turn;
	}

	public int getScore() {
		return score;
	}

}
