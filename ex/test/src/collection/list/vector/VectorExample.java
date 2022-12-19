package collection.list.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();
        String title = "제목";
        String content = "내용";
        String writer = "글쓴이";

        for (int i = 1; i <= 5; i++) {
            String num = String.valueOf(i);
            list.add(new Board(title + num, content + num, writer + num));
        }

        list.remove(2);
        list.remove(3);

        for (int i = 0; i < list.size(); i++) {
            Board board = list.get(i);
            System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
        }
    }
}
