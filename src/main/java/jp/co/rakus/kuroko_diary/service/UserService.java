package jp.co.rakus.kuroko_diary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jp.co.rakus.kuroko_diary.domain.User;
import jp.co.rakus.kuroko_diary.repository.UserRepository;

@Service
@Transactional
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	/**
	 * メールアドレスでユーザーを検索するメソッド.
	 * @param mailAddress
	 * @return ユーザー
	 */
	public User findByMailAddress(String mailAddress){
		return userRepository.findByMailAddress(mailAddress);
	}
	
	/**
	 * ユーザー情報を登録するメソッド.
	 * @param user ユーザー
	 */
	public void save(User user) {
		userRepository.save(user);
	}
}
