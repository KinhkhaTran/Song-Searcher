// --== CS400 Fall 2023 File Header Information ==--
// Name: Kinhkha Tran
// Email: Ktran33@wisc.edu
// Group: B25
// TA: ZHEYANG XIONG
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.util.List;

/**
 * Define an interface for the Backend functionality which reads data from a file,
 *             calculates the Average Dancability score, and gets a list of songs over a certain
 *             danceability threshold.
 */
public interface BackendInterface extends IterableMultiKeySortedCollectionInterface {
        /**
         * Constructs a BackendConstructor instance with an initial list of songs.
         * Constructor: public BackendConstructor(List<Song> songList,
         * IterableMultiKeySortedCollectionInterface rbt)
         * @param songList The initial list of songs to populate the backend.
         * @param rbt pass an instance of their RBT into the backend
         */

        /**
         * method that reads data from file
         * @param filePath
         */
        void dataFromFileReader(String filePath);
        /**
         * Calculates and returns the average danceability score of all songs in the backend.
         * @param songList
         * @return The average danceability score.
         */
        double calculateAverageDanceabilityScore(List<Song> songList);

        /**
         * Getter method for list of songs above dancability threshold
         * @param threshold
         * @return List of songs above dancability Threshold
         */
        List<Song> getSongsAboveDanceabilityThreshold(List<Song> songList, double threshold);


}
