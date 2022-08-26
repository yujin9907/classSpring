package site.meatacoding.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	// 테스트를 위한 컨트룰러
	@GetMapping("/")
	public String index() {
		return "index";
	}
}
