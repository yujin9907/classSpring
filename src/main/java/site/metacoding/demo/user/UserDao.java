package site.metacoding.demo.user;

public class UserDao {
	
	// 서비스 따로 만들지 않음(원래는 만들어야 되는데 컨트룰러 연습해야 됨)
	// 테이블 만들고, 다오 만들고 컨트룰러 만듦
	
	public User findById(Integer id) {
		// 받아준 거처럼 만들기(직접 값을 입력)
		return new User(1, "ssar", "123", "ssar");
	}
}
