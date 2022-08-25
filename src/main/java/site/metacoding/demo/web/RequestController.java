package site.metacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RequestController {
	
	// 파일 찾는 방법 ; 리턴 값은 데이터가 아니라 파일명
	@GetMapping("/user/userList") // 이것도 매핑 규칙이 있음
	public String userList() {
		return "user/userList";
	}
	
	// 특정인 한명 찾기 클라이언트(id)를 받는 방식 두가지 : 쿼리스트링(으로) 받기
	@GetMapping("/user/userinfo")
	public String userinfo(Integer id, String username) { // 여기에다 폼에 넣어주는 값을 넣고 전송해주기만 하면 됨
		// 매개변수를 받으면, id가 제공되야 되는데(문법), 쿼리스트링으로 아이디 안 주면 오류남
		// 음.. 그 dao 테이블 만들고 jdbc 했던 거랑 연계해서 생각해보기
		// 쿼리스트링은 키값이 있으므로 구체적 질의 할 때 사용 요즘 페러다임은 근데 쿼리스트링 사용 잘 안 함
		System.out.println("id: "+id);
		System.out.println("username"+username); // http://localhost:9090/user/userinfo?id=1&username=ssar
		return "user/userinfo"; // 프론트에서 키값으로 넘겨줘야 됨
	}
	
	// 패스배리어블, 패스 값(으로) 받기
	// 주소가 훨씬 깔끔하므로 이 방식 선호
	@GetMapping("/user/userinfo2/{id}")
	public String userinfo2(@PathVariable Integer id) { 
		// 패스베리어블 어노테이션 없으면 오류남 
		System.out.println("id: "+id);
		return "user/userinfo"; 
	}
	
	// 회원 가입 페이지, 그냥 페이지를 보여주려고/로그인폼
	@GetMapping("/user/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	// 요청 재분배하기
	// 회원 가입 완료, db에 데이터 주는 거/로그인 버튼을 누르면 데이터를 줘야됨/post= 줄게!
	@PostMapping("/user/join") // 실제로 디비에 인서팅하기 위함
	public String join(String username, String password, String email) { // 포스트방식의 데이터 이렇게 받음
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		// 값을 받아서 디비 연결하고 insert
//		return "user/main"; 이렇게 적으면 메인에 필요한 데이터를 받아오지 못함(로그인이 완료된 화면을 돌려줘야 되는데, 그냥 MAIN 페이지를 돌려주면 그냥 메인페이지임
		// 그래서 데이터를 들고 가게 해줘야 됨
		return "redirect:/user/main"; // 이건 파일을 찾는 게 아니라 컨트룰 메서드를 반환, 찾게 하는 거임 redirect라는 문법
		// 파일요청 아니고 메서드를 부르는 주소임
	}
	
	@GetMapping("/user/main")
	public String main() {
		// DB에서 셀렉트한 결과를 가지고 메인페이지로 가는 로직 필요
		return "user/main";
	}
}
