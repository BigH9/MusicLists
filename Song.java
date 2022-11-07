public class Song {
    private String artist;
    private String song;
    private int playcount;

    // Declaring the variables
    public Song(String artist, String song, int playcount)
    {
        this.artist = artist;
        this.song = song;
        this.playcount = playcount;

    }
    // Print out format 
    public void print(){
        System.out.println("Artist: " +this.artist + "Song: " +this.song + "Playcount: " +this.playcount);

    }


    public String getname() {
        return artist;
    }
    // get the play count
    public int getplaycount() {
        return playcount;
    }
}

