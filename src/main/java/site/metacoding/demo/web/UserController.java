package site.metacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import site.metacoding.demo.user.User;
import site.metacoding.demo.user.UserDao;

@Controller
public class UserController {
	@GetMapping("/user/{id}")
	public String detail(@PathVariable Integer id, Model model) {
		// 원래는 다오가 IOC 컨테이너에 뜨도록 만들어줘야되는데 연습
		
		//model, 데이터를 뷰에 들고가고 싶으면 모델을 쓴다 생각(디스패처서블릿이 모델을 만들어줌)
		// view에 띄울 때 사용하는 거임(플러터 restcontroller 사용시 필요없음) 
		UserDao userdao = new UserDao();
		User userPS = userdao.findById(id); // 여기까지 db에서 가저온 정보를 userPS에 담은 거임
		
		model.addAttribute("user", userPS); // (키, 오브젝트 데이터)를 모델에 담아서 뷰에 들고 가는 거 뭘로도 들어감 타입이 오브젝트임
		// 즉, 컨트룰러가 데이터를 뷰까지 끌고 가는 기술 : 일이주뒤에 설명해줌 그 원리를 
		return "user/detail";
	}
}
