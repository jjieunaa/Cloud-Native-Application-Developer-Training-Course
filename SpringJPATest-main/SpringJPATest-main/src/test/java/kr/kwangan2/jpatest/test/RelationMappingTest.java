package kr.kwangan2.jpatest.test;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.entity.Member;
import kr.kwangan2.jpatest.repository.BoardRepository;
import kr.kwangan2.jpatest.repository.MemberRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class RelationMappingTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	@Autowired
	private MemberRepository memberRepo;
	
	// @Test
	public void testManyToOneInsert() {
		Member member1 = new Member("member1", "member1pass", "지은", "사용자");
		
		Member member2 = new Member("member2", "member2pass", "단지", "관리자");
		
		for (int i=1; i<=3; i++) {
			Board board = new Board("지은 제목"+i, member1, "지은 내용"+i, new Date(), 0L);
			board.setMember(member1);
		}
		memberRepo.save(member1);
		
		for (int i=1; i<=3; i++) {
			Board board = new Board("단지 제목"+i, member2, "단지 내용"+i, new Date(), 0L);
			board.setMember(member2);
		}
		memberRepo.save(member2);
	}
	
	/*
	@Test
	public void testManyToOneSelect() {
		Board board = boardRepo.findById(5L).get();
		log.info(board);
	}
	*/
	
	// @Test
	public void testTwoWayMapping() {
		Member member = memberRepo.findById("member1").get();
		log.info(member.getName());
		
		List<Board> boardList = member.getBoardList();
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	@Test
	public void testCascadeDelete() {
		memberRepo.deleteById("member2");
	}

}
