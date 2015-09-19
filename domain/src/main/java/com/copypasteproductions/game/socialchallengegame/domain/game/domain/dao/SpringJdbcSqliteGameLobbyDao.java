package com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.RowMapper;

import com.copypasteproductions.game.socialchallengegame.domain.game.domain.GameLobby;

public class SpringJdbcSqliteGameLobbyDao implements GameLobbyDao {

	JdbcOperations sqlLiteJdbcOps;
	
	
	public SpringJdbcSqliteGameLobbyDao(JdbcOperations sqlLiteJdbcOps) {
		super();
		this.sqlLiteJdbcOps = sqlLiteJdbcOps;
	}

	public GameLobby getGameLobbyById(int Id) {
		
		GameLobby g = sqlLiteJdbcOps.queryForObject("SELECT GM_LBBY_ID, GM_NM, TURN_NUM, TIME_OUT_DT_TM FROM GAME_LOBBY WHERE GM_LBBY_ID = "+Id, new RowMapper<GameLobby>(){

			public GameLobby mapRow(ResultSet arg0, int arg1) throws SQLException {
			return new GameLobby(arg0.getInt(1), arg0.getString(2), arg0.getDate(4), null, null, arg0.getInt(3));
			}});
		
		
		return g;
	}

	public GameLobby updateGameLobby(GameLobby lobby) {
		// TODO Auto-generated method stub
		return null;
	}

	public GameLobby deleteGameLobbyById(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	public GameLobby createGameLobby(GameLobby lobby) {
		// TODO Auto-generated method stub
		return null;
	}

}
