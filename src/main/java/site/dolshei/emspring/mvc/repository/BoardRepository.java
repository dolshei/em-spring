package site.dolshei.emspring.mvc.repository;

import org.springframework.stereotype.Repository;
import site.dolshei.emspring.mvc.domain.Board;

import java.util.List;

@Repository
public interface BoardRepository {

    List<Board> getList();

    Board get(int boardSeq);

    void save(Board board);

    void update(Board board);

    void delete(int boardSeq);

}
