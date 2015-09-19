package com.copypasteproductions.game.socialchallengegame.domain.game.domain;

public class Challenge {
	private Integer challengeId;
	private String title;
	private String description;
	private ChallengeDifficulty difficulty;
	
		
	public Challenge(Integer challengeId, String title, String description, ChallengeDifficulty difficulty) {
		super();
		this.challengeId = challengeId;
		this.title = title;
		this.description = description;
		this.difficulty = difficulty;
	}
	public Integer getChallengeId() {
		return challengeId;
	}
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public ChallengeDifficulty getDifficulty() {
		return difficulty;
	} 

}
