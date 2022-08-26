package site.meatacoding.demo.domain.member;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Member {
	private Integer id;
	private String username;
	private String passowrd;
	private String email;
}
