package site.dolshei.emspring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.dolshei.emspring.mvc.domain.Board;
import site.dolshei.emspring.mvc.service.BoardService;

import java.util.List;

@RestController
@RequestMapping("/board")
public class BoardController {
    @Autowired
    private BoardService boardService;

    /**
     * 록록 리턴
     * @return
     */
    @GetMapping
    public List<Board> getList(){
        return boardService.getList();
    }


    /**
     * 상세정보 리턴
     * @param boardSeq
     * @return
     */
    @GetMapping("{boardSeq}")
    public Board get(@PathVariable int boardSeq) {
        return boardService.get(boardSeq);
    }

    /**
     * 게시글 저장 / 수정
     * @param parameter
     */
    @GetMapping("/save")
    public int save(Board parameter) {
        boardService.save(parameter);
        return parameter.getBoardSeq();
    }

    /**
     * 게시글 삭제
     * @param boardSeq
     */
    @GetMapping("/delete/{boardSeq}")
    public boolean delete(@PathVariable int boardSeq) {
        Board board = boardService.get(boardSeq);
        if (board == null) {
            return false;
        }
        boardService.delete(boardSeq);
        return true;
    }

}
