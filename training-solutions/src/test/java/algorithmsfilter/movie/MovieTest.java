package algorithmsfilter.movie;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {

    @Test
    void createMovieTest(){
        Movie movie = new Movie("Alien",Category.SCIFI,5);

        assertEquals("Alien",movie.getTitle());
        assertEquals(Category.SCIFI,movie.getCategory());
        assertEquals(5,movie.getRating());
    }

}