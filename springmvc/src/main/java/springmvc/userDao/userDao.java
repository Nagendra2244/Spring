package springmvc.userDao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import springmvc.Model.User;

@Repository
public class userDao {

	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
	
	public void insertUser(User user) {
		
		String sql = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";
		jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getPassword());
	}
	
	public void updateUser(User user) {
		
		String sql = "UPDATE user SET username = ?, email = ?, password = ? WHERE id = ?";
		jdbcTemplate.update(sql, user.getUsername(), user.getEmail(), user.getPassword(), user.getId());
	}
	
	public List<User> getAllUsers(){
		
		String sql = "SELECT * FROM user";
		List<User> users = jdbcTemplate.query(sql, new UserRowMapper());
		return users;
	}
	
    public User getUserById(int id){
		
    	String sql = "SELECT * FROM user WHERE id = ?";
		User user = jdbcTemplate.queryForObject(sql, new Object[]{id}, new UserRowMapper());
		return user;
	}
	
	public void delete(int id) {
		
		String sql = "DELETE FROM user WHERE id = ?";
		jdbcTemplate.update(sql, id);
	}
}