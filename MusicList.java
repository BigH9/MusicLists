import java.util.ArrayList;

public class MusicList {
    public static void main(String[] args)
    // List of songs 
    {
        Song wewantwraiths = new Song( "WeWantWraiths   ", "Chanaynay   ", 8020296);
        Song stormzy = new Song("Stormzy   ", "Hide & Seek   ", 3886881);
        Song chinx = new Song("Chinx   ", "Pretty Petite   ", 13752);
        Song migos = new Song("Migos   ", "Fight Night   ", 30814002);
        Song skeng = new Song("Skeng   ", "Likkle Miss   ", 3882603);
        Song spinabenz = new Song("Spinabenz   ", "Country Gospel   ", 407563);
        Song nitonb = new Song("NitoNB   ", "Took My Time   ", 157344);
        Song youngsmokes = new Song("Young Smokes   ", "Heart Warming Drill   ", 208852);
        Song quondorondo = new Song("Quando Rondo   ", "Soul Reaper   ", 12285555);
        Song richi = new Song("Richi   ", "Mobbin   ", 415734);

        // How to print the songs in drop down

        ArrayList<Song> musics = new ArrayList<Song>();
        musics.add(wewantwraiths);
        musics.add(stormzy);
        musics.add(chinx);
        musics.add(migos);
        musics.add(skeng);
        musics.add(spinabenz);
        musics.add(nitonb);
        musics.add(youngsmokes);
        musics.add(quondorondo);
        musics.add(richi);

        int musicnumb = 0;
        for (Music song : musics)
        {
            System.out.println("No "+ musicnumb);
            song.print();
            musicnumb++;
        
        }
// this part of the code is to remove a song 
        for (Song music : musics)
        {music.print();}

        String song = InputReader.getString(prompt:"Want to remove the song?")
        song.toLowerCase();
        if (song.equalsIgnoreCase(anotherString:"y"))
        {
            int hh1 = InputReader.getInt(prompt:"Input a song number from 0-10");
            if(hh1 <= musicnumb)
            musics.remove(hh1);
            for (Music it  : musics) {
                it.print();
            }
        }
    // this part of the code is where you add a song
    String hh2 = InputReader.getString(prompt: " want to add a song?");
    if (hh2.equalsIgnoreCase(anotherString: "yes")) {
        String songadd = InputReader.getString(prompt: "What is the song name? ");
        String artistadd = InputReader.getString(prompt: "What is the artists name? ");
        String playcountadd = InputReader.getInt(prompt: "How many views does it have? ");
        System.out.print("artist:" + artistadd +);
        System.out.print("song:" + songsadd +);
        System.out.print("playcount:" +playcountadd +);
        music newsong = new music (songsadd, artistadd, playcountadd);
        songs.add(newsong);
        for (music i:songs) {
            i.print();

        int hh3 = InputReader.getInt(prompt: "Want to remove a song? Pick a Number From 0-10 from the music list ");
        String hh4 = Input Reader.getString("Are you sure " + hh3 + "?");
        songs.remove(hh3);
        for( music 1 :songs) {
            System.out.print(s: "Songnumber: 0");
            1.print();
        }
        }
        {
            // choose by view count
            try (Scanner choose = new Scanner(System.in)){
                System.out.println(x: "How many views does the song your searching have?" );
                int playcount = choose.nextInt();
                for (music music : songs){
                    if(playcount <= music.getPlaycount()){
                        music.print();
                        System.out.println();
                    }

                }

            }
            // Send off
            System.out.println(x: "Appreciate you using this service";)

        }


    }
  
    }
}
