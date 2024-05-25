package org.example.homework10.albumInnerClass;

import java.util.ArrayList;

public class Album {
    String title;
    SongList songList;

    public Album(String title) {
        this.title = title;
        this.songList = new SongList();
    }

    public class SongList {
        ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean addSong(Song song) {
            if (findSongByTitle(song.getSongName()) == null) {
                songs.add(song);
                return true;
            }
            return false;
        }

        public Song findSongByTitle(String songName) {
            for (Song song : songs) {
                if (song.getSongName().equalsIgnoreCase(songName)) {
                    return song;
                }
            }
            return null;
        }

        public Song findSongByTrackNumber(int songNumber) {
            for (Song song : songs) {
                if (song.getSongId() == songNumber) {
                    return song;
                }
            }
            return null;
        }

    }

    public class Song {
        public int getSongId() {
            return songId;
        }

        public String getSongName() {
            return songName;
        }

        public Double getSongDuration() {
            return songDuration;
        }

        private int songId;
        private String songName;
        private Double songDuration;


        public Song(int songId, String songName, Double songDuration) {
            this.songId = songId;
            this.songName = songName;
            this.songDuration = songDuration;
        }

        @Override
        public String toString() {
            return "{" +
                    "songId = " + songId +
                    ", songName = '" + songName + '\'' +
                    ", songDuration = " + songDuration +
                    '}';
        }
    }

}