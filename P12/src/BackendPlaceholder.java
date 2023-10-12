// --== CS400 Fall 2023 File Header Information ==--
// Name: Kinhkha Tran
// Email: Ktran33@wisc.edu
// Group: B25
// TA: ZHEYANG XIONG
// Lecturer: Gary Dahl
// Notes to Grader: <optional extra notes>
import java.util.Iterator;
import java.util.List;

public class BackendPlaceholder implements BackendInterface{

    public BackendPlaceholder() {

    }

    @Override
    public void dataFromFileReader(String filePath) {
        if (filePath == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public double calculateAverageDanceabilityScore(List<Song> songList) {
        if (songList == null) {
            throw new NullPointerException();
        }
        return 0;
    }

    @Override
    public List<Song> getSongsAboveDanceabilityThreshold(List<Song> songList, double threshold) {
        if (songList == null) {
            throw new NullPointerException();
        }
        return songList;
    }

    @Override
    public boolean insertSingleKey(Comparable key) {
        return false;
    }

    @Override
    public int numKeys() {
        return 0;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public void setIterationStartPoint(Comparable startPoint) {

    }

    @Override
    public boolean insert(Comparable data) throws NullPointerException, IllegalArgumentException {
        return false;
    }

    @Override
    public boolean contains(Comparable data) {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void clear() {

    }
}
