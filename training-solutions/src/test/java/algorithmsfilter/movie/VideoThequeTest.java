package algorithmsfilter.movie;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class VideoThequeTest {

    VideoTheque videoTheque = new VideoTheque();

    @BeforeEach
    void init(){
        videoTheque.addMovie(new Movie("Titanic",Category.DRAMA, 4));
        videoTheque.addMovie(new Movie("Alien",Category.SCIFI, 5));
        videoTheque.addMovie(new Movie("Thing",Category.SCIFI, 4));
        videoTheque.addMovie(new Movie("Argo",Category.VIGJATEK, 5));
        videoTheque.addMovie(new Movie("Sharknado",Category.SCIFI, 1));

    }

    @Test
    void getGoodMoviesWithCategoryGivenTest(){
        List<Movie> filltered = videoTheque.getGoodMoviesWithCategoryGiven(Category.SCIFI);

        assertEquals(2, filltered.size());
        assertEquals("Alien",filltered.get(0).getTitle());
    }

}





