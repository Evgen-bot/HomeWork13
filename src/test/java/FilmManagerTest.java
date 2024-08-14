import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void testWith0Films() {
        FilmManager manager = new FilmManager();

        String[] expected = {};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWith1Film() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie I");

        String[] expected = {"Movie I"};
        String[] actual = manager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWith3Films() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie III");
        manager.addFilm("Movie II");
        manager.addFilm("Movie I");

        String[] expected = {"Movie I", "Movie II", "Movie III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWith5Films() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");


        String[] expected = {"Movie V", "Movie IV", "Movie III", "Movie II", "Movie I"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testWith7Films() {
        FilmManager manager = new FilmManager();

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");


        String[] expected = {"Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testWith9Films() {
        FilmManager manager = new FilmManager(7);

        manager.addFilm("Movie I");
        manager.addFilm("Movie II");
        manager.addFilm("Movie III");
        manager.addFilm("Movie IV");
        manager.addFilm("Movie V");
        manager.addFilm("Movie VI");
        manager.addFilm("Movie VII");
        manager.addFilm("Movie VIII");
        manager.addFilm("Movie IX");


        String[] expected = {"Movie IX", "Movie VIII", "Movie VII", "Movie VI", "Movie V", "Movie IV", "Movie III"};
        String[] actual = manager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
