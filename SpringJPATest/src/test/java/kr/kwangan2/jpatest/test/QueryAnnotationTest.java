package kr.kwangan2.jpatest.test;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class QueryAnnotationTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	/*
	// @Test
	public void testQueryAnnotationTest1() {
		List<Board> boardList = boardRepo.queryAnnotationTest1("제목10");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	// @Test
	public void testQueryAnnotationTest2() {
		List<Board> boardList = boardRepo.queryAnnotationTest2("제목10");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	// @Test
	public void testQueryAnnotationTest3() {
		List<Object[]> boardList = boardRepo.queryAnnotationTest3("제목10");
		
		for (Object[] objArray : boardList) {
			log.info(objArray[0]+":"+objArray[1]+":"+objArray[2]+":"+objArray[3]);
		}
	}
	
	// @Test
	public void testQueryAnnotationTest4() {
		List<Object[]> boardList = boardRepo.queryAnnotationTest4("제목10");
		
		for (Object[] objArray : boardList) {
			log.info(objArray[0]+":"+objArray[1]+":"+objArray[2]+":"+objArray[3]);
		}
	}
	
	@Test
	public void testQueryAnnotationTest5() {
		Pageable paging = PageRequest.of(0, 3, Sort.Direction.DESC, "seq");
		
		List<Board> boardList = boardRepo.queryAnnotationTest5(paging);
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	*/

}
