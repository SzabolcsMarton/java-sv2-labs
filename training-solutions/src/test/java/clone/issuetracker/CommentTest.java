package clone.issuetracker;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class CommentTest {

    @Test
    void createCommentTest() {
        LocalDateTime time = LocalDateTime.of(2021, 1, 16, 10, 0, 0);
        Comment comment = new Comment("Test",time);

        assertEquals("Test", comment.getText());
        assertEquals(time, comment.getTime());
    }

    @Test
    void createCommentFromOtherCommentTest() {
        LocalDateTime time = LocalDateTime.of(2021, 1, 16, 10, 0, 0);
        Comment commentForCopy = new Comment("Test", time);
        Comment copied = new Comment(commentForCopy);

        assertEquals("Test", copied.getText());
        assertEquals(time, copied.getTime());

    }
}