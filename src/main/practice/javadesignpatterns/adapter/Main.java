package javadesignpatterns.adapter;


// Existing MediaPlayer interface
interface MediaPlayer {
    void play(String fileName);
}

// Concrete class VLCPlayer implementing MediaPlayer interface
class VLCPlayer implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing VLC file: " + fileName);
    }
}

// Another concrete class MP3Player implementing MediaPlayer interface
class MP3Player implements MediaPlayer {
    @Override
    public void play(String fileName) {
        System.out.println("Playing MP3 file: " + fileName);
    }
}


// Another interface for advanced media players
interface AdvancedMediaPlayer {
    void playMP4(String fileName);
}

// Concrete class MP4Player implementing AdvancedMediaPlayer interface
class MP4Player implements AdvancedMediaPlayer {
    @Override
    public void playMP4(String fileName) {
        System.out.println("Playing MP4 file: " + fileName);
    }
}


// Adapter class implementing MediaPlayer interface using AdvancedMediaPlayer
class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(AdvancedMediaPlayer advancedMediaPlayer) {
        this.advancedMediaPlayer = advancedMediaPlayer;
    }

    @Override
    public void play(String fileName) {
        // Adapter's play method calls the specific method of AdvancedMediaPlayer
        advancedMediaPlayer.playMP4(fileName);
    }
}


public class Main {
    public static void main(String[] args) {
        MediaPlayer player = new VLCPlayer();
        player.play("song.vlc"); // Output: Playing VLC file: song.vlc

        // Now, using the MediaAdapter to play an MP4 file using the MediaPlayer interface
        AdvancedMediaPlayer mp4Player = new MP4Player();
        MediaPlayer adapter = new MediaAdapter(mp4Player);
        adapter.play("movie.mp4"); // Output: Playing MP4 file: movie.mp4
    }
}

