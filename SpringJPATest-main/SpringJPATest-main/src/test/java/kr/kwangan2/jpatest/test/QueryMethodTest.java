package kr.kwangan2.jpatest.test;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
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
public class QueryMethodTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	// @Test
	/*
	public void testFindByTitle() {
		for (int i=1; i<=200; i++) {
			Board board = new Board("제목"+i, "작성자"+i, "내용"+i, new Date(), 0L);
			boardRepo.save(board);
		}
		
		List<Board> boardList = boardRepo.findByTitle("테스트 제목 10");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	// @Test
	public void testByContentContaining() {
		List<Board> boardList = boardRepo.findByContentContaining("17");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	// @Test
	public void testFindByTitleContainingOrContentContainint() {
		List<Board> boardList = boardRepo.findByTitleContainingOrContentContaining("17", "17");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	// @Test
	public void testFindByTitleContainingOrderBySeqDesc() {
		List<Board> boardList = boardRepo.findByTitleContainingOrderBySeqDesc("17");
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	
	@Test
	public void testFindByTitleContaining() {
		Pageable paging = PageRequest.of(0, 5, Sort.Direction.DESC, "seq");
		
		Page<Board> pageInfo = boardRepo.findByTitleContaining("제목", paging);
		
		log.info(pageInfo.getSize());
		log.info(pageInfo.getTotalPages());
		log.info(pageInfo.getTotalElements());
		log.info(pageInfo.nextPageable());
		
		List<Board> boardList = pageInfo.getContent();
		
		for (Board board : boardList) {
			log.info(board);
		}
	}
	*/

}
