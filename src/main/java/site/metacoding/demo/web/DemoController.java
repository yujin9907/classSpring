package site.metacoding.demo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/home")
	public void form() {
		System.out.println("나는 홈입니다");
	}

	@GetMapping("/index")
	public String index() {
		return "hello World";
	}
	
	@GetMapping("/h1")
	public String h1() {
		return "<h1>hello World</h1>";
	}
	
	@GetMapping("/alert")
	public String alert() {
		return "<script>alert('hello');</script>";
	}
	
}
