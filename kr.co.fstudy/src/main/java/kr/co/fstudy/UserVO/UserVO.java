package kr.co.fstudy.UserVO;

public class UserVO {

	String id;
	String password;
	String nickname;
	int age;
	public UserVO(String id, String password, String nickname, int age) {
		this.id = id;
		this.password = password;
		this.nickname = nickname;
		this.age = age;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "UserVO [id=" + id + ", password=" + password + ", nickname=" + nickname + ", age=" + age + "]";
	}
	
	
}
