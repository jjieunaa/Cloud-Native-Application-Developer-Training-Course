package kr.kwangan2.jpatest.test;

import java.util.Date;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.repository.BoardRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class BoardTest {
	
	@Autowired
	private BoardRepository boardRepo;
	
	// @Test
	/*
	public void testInsertBoard() {
		Board board = new Board("제목", "작성자", "내용", new Date(), 0L);
		boardRepo.save(board);
	}
	*/
	
	// @Test
	public void testGetBoard() {
		Board board = boardRepo.findById(1L).get();
		log.info(board);
	}
	
	// @Test
	public void testUpdateBoard() {
		Board board = boardRepo.findById(1L).get();
		board.setTitle("수정된 제목");
		log.info("수정 전: " + board);
		boardRepo.save(board);
		log.info("수정 후: " + board);
	}
	
	@Test
	public void testDeleteBoard() {
		boardRepo.deleteById(1L);
	}
}
