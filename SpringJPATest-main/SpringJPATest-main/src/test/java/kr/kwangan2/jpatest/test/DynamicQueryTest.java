package kr.kwangan2.jpatest.test;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;

import com.querydsl.core.BooleanBuilder;

import kr.kwangan2.jpatest.entity.Board;
import kr.kwangan2.jpatest.entity.QBoard;
import kr.kwangan2.jpatest.repository.DynamicBoardRepository;
import lombok.extern.log4j.Log4j2;

@RunWith(SpringRunner.class)
@SpringBootTest
@Log4j2
public class DynamicQueryTest {
	
	@Autowired
	private DynamicBoardRepository dynamicBoardRepo;
	
	@Test
	public void testDynamicQuery() {
		String searchCondition = "TITLE";
		String searchKeyword = "제목10";
		
		BooleanBuilder builder = new BooleanBuilder();
		
		QBoard qboard = QBoard.board;
		
		if (searchCondition.equals("TITLE")) {
			builder.and(qboard.title.like("%" + searchKeyword + "%"));
		} else if (searchCondition.equals("CONTENT")) {
			builder.and(qboard.content.like("%" + searchKeyword + "%"));
		}
		
		Pageable paging = PageRequest.of(0, 5);
		
		Page<Board> boardList = dynamicBoardRepo.findAll(builder, paging);
		
		for (Board board : boardList) {
			log.info(board);
		}
	}

}
