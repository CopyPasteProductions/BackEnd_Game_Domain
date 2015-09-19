/**
 * 
 */
package com.copypasteproductions.game.socialchallengegame.domain.game;

import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao;

/**
 * @author Tim
 *
 */
public class SpringJdbcSQLLiteGAmeLobbyDaoTest {

	JdbcTemplate template;
	SpringJdbcSqliteGameLobbyDao dao;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		   Class.forName("org.sqlite.JDBC"); 
		template = new JdbcTemplate(new DriverManagerDataSource("jdbc:sqlite:G:/StartupReset/backend_game_domain/GameDomain/domain/src/main/resources/GAME.DB"));
		dao = new SpringJdbcSqliteGameLobbyDao(template);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao#SpringJdbcSqliteGameLobbyDao(org.springframework.jdbc.core.JdbcOperations)}
	 * .
	 */
	@Test
	public void testSpringJdbcSqliteGameLobbyDao() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao#getGameLobbyById(int)}
	 * .
	 */
	@Test
	public void testGetGameLobbyById() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao#updateGameLobby(com.copypasteproductions.game.socialchallengegame.domain.game.domain.GameLobby)}
	 * .
	 */
	@Test
	public void testUpdateGameLobby() {
		fail("Not yet implemented");
	}

	/**
	 * Test method for
	 * {@link com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao#deleteGameLobbyById(int)}
	 * .
	 */
	@Test
	public void testDeleteGameLobbyById() {
System.out.println(dao.getGameLobbyById(1));
	}

	/**
	 * Test method for
	 * {@link com.copypasteproductions.game.socialchallengegame.domain.game.domain.dao.SpringJdbcSqliteGameLobbyDao#createGameLobby(com.copypasteproductions.game.socialchallengegame.domain.game.domain.GameLobby)}
	 * .
	 */
	@Test
	public void testCreateGameLobby() {
		fail("Not yet implemented");
	}

}
