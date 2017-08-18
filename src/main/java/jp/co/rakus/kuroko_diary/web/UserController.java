package jp.co.rakus.kuroko_diary.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.rakus.kuroko_diary.domain.User;
import jp.co.rakus.kuroko_diary.service.UserService;

@Controller
@RequestMapping("/login")
public class UserController {

	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public UserForm setUpUserForm(){
		return new UserForm();
	}
	
	
	/**
	 * ログインフォームを表示させるメソッド
	 * @return ログイン画面
	 */
	@RequestMapping
	public String login(){
		return "topview";
	}
	
	/**
	 * 新規登録フォームを表示させるメソッド.
	 * @return 新規登録画面
	 */
	@RequestMapping("/registration")
	public String registration(){
		return "registration";
	}
	
}
