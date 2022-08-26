package site.meatacoding.demo.domain.member;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component // 그냥 new 하고 싶은 애들을 component 하는 거임 컨트룰러에서 일일이 new 해주기 귀찮으니까
public class MemberDao {

	public Integer insert(String username, String password, String email) {
		// db에 저장됐다고 가정하고
		System.out.println("인서트 완료");
		System.out.println(username);
		System.out.println(password);
		System.out.println(email);
		return 1;
	}
	public Integer update(Integer id, String password) {
		System.out.println("업데이트 완료");
		System.out.println(id);
		System.out.println(password);
		return 1;
	}
	
	public Integer deleteById(Integer id) {
		System.out.println("삭제 완료");
		return 1;
	}
	public Member findById(Integer id) {
		
		Member m1 = new Member(1, "ssar", "123", "ssar@n.c");
		Member m2 = new Member(2, "cos", "123", "cos@n.c");
		
		if (id==1) {
			return m1;
		} else if (id==2) {
			return m2;
		} else {
			return new Member(); // 또는 null
		}
		
	}
	public List<Member> findAll(){
		Member m1 = new Member(1, "ssar", "123", "ssar@n.c");
		Member m2 = new Member(2, "cos", "123", "cos@n.c");
		
		List<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);
		return memberList;
	}
}
