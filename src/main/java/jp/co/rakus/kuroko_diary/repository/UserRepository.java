package jp.co.rakus.kuroko_diary.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.stereotype.Repository;

import jp.co.rakus.kuroko_diary.domain.User;

/**
 * ユーザーに関する情報を操作するクラス.
 * @author yuka.matsumoto
 *
 */
@Repository
public class UserRepository {

	@Autowired
	private NamedParameterJdbcTemplate template;
	
	private static final RowMapper<User> userRowMapper=(rs,i)->{
		User user=new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setMailAddress(rs.getString("mail_address"));
		user.setPassword(rs.getString("password"));
		
		return user;
	};
	
	/**
	 * メールアドレスでユーザーを検索するメソッド.
	 * @param mailAddress メールアドレス
	 * @return　ユーザー情報
	 */
	public User findByMailAddress(String mailAddress){
		SqlParameterSource param=new MapSqlParameterSource().addValue("mailAddress", mailAddress);
		String sql="select id,name,mail_address,password from users where mail_address=:mailAddress";
		
		User user=template.queryForObject(sql, param, userRowMapper);
		return user;
		
		}
	
	/**
	 * ユーザー情報をデータベースに登録するメソッド.
	 * @param user ユーザー
	 */
	public void save(User user){
		SqlParameterSource param=new BeanPropertySqlParameterSource(user);
		String sql="insert into users(name,mail_address,password values(:name,:mail_address,:password)";
		template.update(sql, param);
	}
}
