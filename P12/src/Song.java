// --== CS400 Fall 2023 File Header Information ==--
// Name: Kinhkha Tran
// Email: Ktran33@wisc.edu
// Group: B25
// TA: ZHEYANG XIONG
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>

/**
 * An interface that is filled with getter methods to obtain Artist name, Title Name,
 * the year the song was released, the genre, and the danceablility score.
 */
public interface Song extends Comparable<Song> {

    /**
     * Constructs a Song instance with the specified attributes.
     * Constructor: Public Song(String artist, String songTitle, int year,
     * String genre, double dancabilityScore)
     * @param artist - Name of artist.
     * @param title - Title of the song.
     * @param year - The release year of the song.
     * @param genre - The genre of the song.
     * @param danceability - The danceability score of the song.
     */


    /**
     * Getter method for Artist's name
     * @return Artist's name
     */
    String getArtist();
    /**
     * Getter method for song title name
     * @return song title name
     */
    String getSongTitle();

    /**
     * Getter method for the year of the song it was released
     * @return year of song
     */
    int getYear();

    /**
     * Getter method for the genre of the song
     * @return genre of song
     */
    String getGenre();
    /**
     * Getter Method danceability score
     * @return danceability score
     */
    double getDanceabilityScore();

}
