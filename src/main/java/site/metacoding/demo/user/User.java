package site.metacoding.demo.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 엔티티, 테이블과 똑같이 생성
// 디폴트생성자, 풀생상자, 게터세터 필요 => 롬북으로 간단하게 정리
// 밑에 세트는 같이 생성
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {
	private Integer id;
	private String username;
	private String password;
	private String email;

	// 직접 풀생성자를 만들면, 단점 : 파라미터가 지워지거나 (칼럼을 수정해야 될 때
	// 일일이 해줘야 되기 때문에 유지보수 곤란
	// 롬북 아규멘트, 어노테이션을 사용하면, 런타임 때 작동함으로 알아서 해줌
	// 즉, 컴파일 시점에는 생성자가 없음 = 툴은 어노테이션을 보고 생성자가 없지만 나주에 생기겠네 하고 오류 안냄

	// 마찬가지로 게터세터도 필드마다 유지보수해줘야되기 때문에 편함
	// 롬북 세팅, 개념 정리 필수 : 빌드 그래이들에 두개 -> 툴 끄고 필러그인 설치 -> 사용
	
	// 이 다음 다오 만들 겨
}
