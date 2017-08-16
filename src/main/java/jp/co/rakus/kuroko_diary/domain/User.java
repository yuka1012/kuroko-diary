package jp.co.rakus.kuroko_diary.domain;

/**
 * ユーザー情報のドメインクラス
 * @author ゆうか
 *
 */
public class User {

	/** ID*/
	private Integer id;
	/** 名前*/
	private String name;
	/** メールアドレス*/
	private String mailAddress;
	/** パスワード*/
	private String password;
	/** 確認用パスワード*/
	private String checkPassword;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMailAddress() {
		return mailAddress;
	}
	public void setMailAddress(String mailAddress) {
		this.mailAddress = mailAddress;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCheckPassword() {
		return checkPassword;
	}
	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}
	
	
	
}
