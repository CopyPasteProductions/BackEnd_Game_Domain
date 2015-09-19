package com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao;

import com.copypasteproductions.game.socialchallengegame.domain.game.domain.Challenge;

public interface ChallengeDao {
	
	public Challenge getChallengeById(int id);
	
	public Challenge deleteChallengeById(int id);
	
	public void updateChallenge(Challenge c);
	
	public void createChallenge(Challenge c);

}
