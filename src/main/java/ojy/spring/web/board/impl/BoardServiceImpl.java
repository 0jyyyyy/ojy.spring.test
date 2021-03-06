/*
package ojy.spring.web.board.impl;

import java.util.List;

import ojy.spring.web.board.BoardService;
import ojy.spring.web.board.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ojy.spring.web.board.BoardService;
import ojy.spring.web.board.BoardVO;
import ojy.spring.web.common.*;
@Service("boardService")
public class BoardServiceImpl implements BoardService {
	@Autowired
	private BoardDAOSpring boardDAO;
	@Override
	public void insertBoard(BoardVO vo) {
//		if(vo.getSeq() == 0) {
//			throw new IllegalArgumentException("0번 글은 등록할 수 없습니다.");
//		}
		boardDAO.insertBoard(vo); //1000번 글 등록 성공
		boardDAO.insertBoard(vo); //exception 발생
		}
	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
		}
	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
		}
	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
		}
	@Override public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
		}
}
*/