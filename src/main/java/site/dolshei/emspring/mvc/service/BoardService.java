package site.dolshei.emspring.mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import site.dolshei.emspring.mvc.domain.Board;
import site.dolshei.emspring.mvc.repository.BoardRepository;

import java.util.List;

/**
 * Board Service
 * @author dolshei
 */
@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    /**
     * 록록 리턴
     * @return
     */
    public List<Board> getList(){
        return boardRepository.getList();
    }


    /**
     * 상세정보 리턴
     * @param boardSeq
     * @return
     */
    public Board get(int boardSeq) {
        return boardRepository.get(boardSeq);
    }

    /**
     * 게시글 저장
     * @param board
     */
    public void save(Board board) {
        boardRepository.save(board);
    }

    /**
     * 게시글 수정
     * @param board
     */
    public void update(Board board) {
        boardRepository.update(board);
    }

    /**
     * 게시글 삭제
     * @param boardSeq
     */
    public void delete(int boardSeq) {
        boardRepository.delete(boardSeq);
    }

}
