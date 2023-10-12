// --== CS400 Fall 2023 File Header Information ==--
// Name: Kinhkha Tran
// Email: Ktran33@wisc.edu
// Group: B25
// TA: ZHEYANG XIONG
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BackendDeveloperTests {

    BackendInterface backend = new BackendPlaceholder();
    /**
     * test dataFromFileReaderMethod with null input
     */
    @Test
    public void test1() {
        try {
            backend.dataFromFileReader(null);
            Assertions.fail();
        } catch (Exception e) {

        }
    }

    /**
     * Calculate Danceability Score
     */
    @Test
    public void test2() {
        List<Song> songList = new ArrayList<>();
        Song song1 = null;
        Song song2 = null;
        Song song3 = null;
        Song song4 = null;
        Song song5 = null;
        songList.add(song1);
        songList.add(song2);
        songList.add(song3);
        songList.add(song4);
        songList.add(song5);
        Assertions.assertEquals(0.0, backend.calculateAverageDanceabilityScore(songList));
    }

    /**
     * retrieve the songs above danceability threshold
     */
    @Test
    public void test3() {
        List<Song> songList = new ArrayList<>();
        Song song1 = null;
        songList.add(song1);
        songList.add(song1);
        songList.add(song1);
        songList.add(song1);
        songList.add(song1);
        Assertions.assertTrue(backend.getSongsAboveDanceabilityThreshold(songList, 0) == songList);
    }

    /**
     * test calculateAverageDanceabilityScore if songList is null
     */
    @Test
    public void test4() {
        try {
            backend.calculateAverageDanceabilityScore(null);
            Assertions.fail();
        } catch (Exception e) {

        }
    }

    /**
     * test getSongsAboveDanceabilityThreshold if songlist is null
     */
    @Test
    public void test5() {
        try {
            backend.getSongsAboveDanceabilityThreshold(null, 10);
            Assertions.fail();
        } catch (Exception e) {

        }
    }
}