package com.copypasteproductions.game.socialchallengegame.domain.game.domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class GameLobby {

	/**
	 * The Unique Id for this Lobby
	 */
	private int lobbyID;

	/**
	 * The Name of this Lobby non-unique
	 */
	private String gameName;
	/**
	 * The expiration date of the lobby
	 */
	private Date timeout;
	
	//TODO: Determine whether this should be a queue.
	/**
	 * Set of Player information for this Lobby
	 */
	private Set<Player> players;
	/**
	 * Set of challengeIds that have been used by this lobby.
	 */
	private Set<Integer> challengeIds;

	/**
	 * Turn Number for the lobby
	 */
	private int turnNumber;
	
	

	public int getTurnNumber() {
		return turnNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((challengeIds == null) ? 0 : challengeIds.hashCode());
		result = prime * result + ((gameName == null) ? 0 : gameName.hashCode());
		result = prime * result + lobbyID;
		result = prime * result + ((players == null) ? 0 : players.hashCode());
		result = prime * result + ((timeout == null) ? 0 : timeout.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameLobby other = (GameLobby) obj;
		if (challengeIds == null) {
			if (other.challengeIds != null)
				return false;
		} else if (!challengeIds.equals(other.challengeIds))
			return false;
		if (gameName == null) {
			if (other.gameName != null)
				return false;
		} else if (!gameName.equals(other.gameName))
			return false;
		if (lobbyID != other.lobbyID)
			return false;
		if (players == null) {
			if (other.players != null)
				return false;
		} else if (!players.equals(other.players))
			return false;
		if (timeout == null) {
			if (other.timeout != null)
				return false;
		} else if (!timeout.equals(other.timeout))
			return false;
		return true;
	}

	public GameLobby(int lobbyID, String gameName, Date timeout, Set<Player> players, Set<Integer> challengeIds, int turnNumber) {
		super();
		this.lobbyID = lobbyID;
		this.gameName = gameName;
		this.timeout = timeout;
		this.players = players;
		this.challengeIds = challengeIds;
		this.turnNumber = turnNumber;
	}

	@Override
	public String toString() {
		return "GameLobby [lobbyID=" + lobbyID + ", gameName=" + gameName + ", timeout=" + timeout + ", players="
				+ players + ", challengeIds=" + challengeIds + ", turnNumber=" + turnNumber + "]";
	}

	/**
	 * Gets the players asociated with this lobby
	 * @return copy of the set of players
	 */
	public Set<Player> getPlayers() {
		return new HashSet<Player>(players);
	}

	public int getLobbyID() {
		return lobbyID;
	}

	public String getGameName() {
		return gameName;
	}

	public Date getTimeout() {
		return timeout;
	}

	/**
	 * Gets the ids of the challenges associated with this lobby
	 * @return copy of the set of players.
	 */
	public HashSet<Integer> getChallengeIds()
	{
		return new HashSet<Integer>(challengeIds);
	}

}
