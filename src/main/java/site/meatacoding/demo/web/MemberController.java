package site.meatacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import site.meatacoding.demo.domain.member.MemberDao;

@Controller
public class MemberController {
	
	private MemberDao memberDao;
	
	public MemberController(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	// 선언하고 생성자만 해주면 주입 끝남 -> 즉, ioc 컨테이너에 올리고 생성자주입만 해주면 됨.
	// 원래는 디폴트 생성자가 있어야 되는데, dao를 컴포넌트 어노테이션으로 메모리에 띄워줬으므로 ㄱㅊ
	
	
	@GetMapping("/member/joinform") // 회원가입이 아니라 회원가입 폼을/실무에선 절대 카멜을 사용하지 않음
	public String joinForm() {
		return "member/joinform"; // 먼저 만들고 나중에 html 만들기
	}
	
	@PostMapping("/member/join") // 회원가입이 아니라 회원가입 폼을/실무에선 절대 카멜을 사용하지 않음
	public String join(String username, String password, String email) {
		Integer result = memberDao.insert(username, password, email);
		if(result==1) {
			return "member/lginform";
		}else {
			return "error/serverError";
		}
		
		// 먼저 만들고 나중에 html 만들기
	}
}
