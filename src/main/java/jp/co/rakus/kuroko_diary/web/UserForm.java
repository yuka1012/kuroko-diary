package jp.co.rakus.kuroko_diary.web;

/**
 * ユーザーフォームクラス
 * @author ゆうか
 *
 */
public class UserForm {
	
	/** ID*/
	private String id;
	/** 名前*/
	private String name;
	/** メールアドレス*/
	private String mailAddress;
	/** パスワード*/
	private String passsword;
	/** 確認用パスワード*/
	private String checkPassword;
	
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public String getPasssword() {
		return passsword;
	}
	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}
	public String getCheckPassword() {
		return checkPassword;
	}
	public void setCheckPassword(String checkPassword) {
		this.checkPassword = checkPassword;
	}
	
	
	

}
