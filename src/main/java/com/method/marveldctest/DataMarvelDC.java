package com.method.marveldctest;

import java.util.ArrayList;

public class DataMarvelDC {
    private String judul;
    private String genre;
    private String durasi;
    private String tahunRilis;
    private String rating;

    public DataMarvelDC(String judul, String genre, String durasi, String tahunRilis, String rating) {
        this.judul = judul;
        this.genre = genre;
        this.durasi = durasi;
        this.tahunRilis = tahunRilis;
        this.rating = rating;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDurasi() {
        return durasi;
    }

    public void setDurasi(String durasi) {
        this.durasi = durasi;
    }

    public String getTahunRilis() {
        return tahunRilis;
    }

    public void setTahunRilis(String tahunRilis) {
        this.tahunRilis = tahunRilis;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Object[] toObjectArray() {
        return new Object[]{judul, genre, durasi, tahunRilis, rating};
    }

    public static ArrayList<DataMarvelDC> getFilms() {
        ArrayList<DataMarvelDC> films = new ArrayList<DataMarvelDC>();
        films.add(new DataMarvelDC("Iron Man", "Action", "126", "2008", "7.9"));
        films.add(new DataMarvelDC("The Batman", "Action", "175", "2022", "7.8"));
        films.add(new DataMarvelDC("Deadpool and Wolverine", "Comedy", "127", "2024", "7.9"));
        films.add(new DataMarvelDC("Spiderman: No Way Home", "Action", "148", "2021", "8.3"));
        films.add(new DataMarvelDC("Spiderman: Far From Home", "Action", "129", "2019", "7.5"));
        films.add(new DataMarvelDC("Venom", "Action", "112", "2018", "6.7"));
        films.add(new DataMarvelDC("Venom: Let There Be Carnage", "Action", "97", "2021", "6.3"));
        films.add(new DataMarvelDC("Batman v Superman: Dawn of Justice", "Action", "151", "2016", "6.5"));
        films.add(new DataMarvelDC("Wonder Woman", "Action", "141", "2017", "7.4"));
        films.add(new DataMarvelDC("Aquaman", "Action", "143", "2018", "6.9"));
        films.add(new DataMarvelDC("Guardians of the Galaxy", "Action", "121", "2014", "8.0"));
        films.add(new DataMarvelDC("Guardians of the Galaxy Vol.2", "Action", "136", "2017", "7.6"));
        films.add(new DataMarvelDC("Black Panther", "Action", "134", "2018", "7.3"));
        films.add(new DataMarvelDC("The Flash", "Action", "144", "2023", "6.5"));
        films.add(new DataMarvelDC("Doctor Strange", "Action", "115", "2016", "7.5"));
        films.add(new DataMarvelDC("Thor: Ragnarok", "Action", "130", "2017", "7.9"));
        films.add(new DataMarvelDC("Thor: Love and Thunder", "Action", "119", "2022", "6.3"));
        films.add(new DataMarvelDC("Captain America: The Winter Soldier", "Action", "136", "2014", "7.8"));
        films.add(new DataMarvelDC("Captain America: Civil War", "Action", "147", "2016", "7.8"));
        films.add(new DataMarvelDC("Suicide Squad", "Action", "123", "2021", "6.0"));
        films.add(new DataMarvelDC("Shazam!", "Action", "132", "2019", "7.0"));
        films.add(new DataMarvelDC("Ant Man", "Action", "117", "2015", "7.3"));
        films.add(new DataMarvelDC("Ant Man and the Wssp", "Action", "118", "2018", "7.0"));
        films.add(new DataMarvelDC("Black Widow", "Action", "134", "2021", "6.7"));
        films.add(new DataMarvelDC("The Dark Knight", "Action", "152", "2008", "9.0"));
        films.add(new DataMarvelDC("Joker", "Drama", "122", "2019", "8.4"));
        films.add(new DataMarvelDC("Man of Steel", "Action", "143", "2013", "7,0"));
        films.add(new DataMarvelDC("Spider-Man", "Action", "121", "2002", "7.3"));
        films.add(new DataMarvelDC("Spider-Man 2", "Action", "127", "2004", "7.3"));
        films.add(new DataMarvelDC("Spider Man 3", "Action", "139", "2007", "6.2"));
        films.add(new DataMarvelDC("X-Men: Days of Future Past", "Action", "131", "2014", "7.9"));
        films.add(new DataMarvelDC("X-Men: Apocalypse", "Action", "144", "2016", "6.9"));
        films.add(new DataMarvelDC("Logan", "Drama", "137", "2017", "8.1"));
        films.add(new DataMarvelDC("The Amazing Spider-Man", "Action", "136", "2012", "6.9"));
        films.add(new DataMarvelDC("The Amazing Spider-Man 2", "Action", "142", "2014", "6.6"));
        films.add(new DataMarvelDC("Daredevil", "Action", "103", "2003", "5.3"));
        films.add(new DataMarvelDC("The Suicide Squad", "Action", "132", "2021", "7.2"));
        films.add(new DataMarvelDC("Wonder Woman 1984", "Action", "151", "2021", "5.4"));
        films.add(new DataMarvelDC("Justice League", "Action", "120", "2017", "6.3"));
        films.add(new DataMarvelDC("Zack Snyder's Justice League", "Action", "242", "2021", "8.1"));
        films.add(new DataMarvelDC("The Eternals", "Action", "157", "2021", "6.3"));
        films.add(new DataMarvelDC("Shang-Chi and the Legend of the Ten Rings", "Action", "132", "2021", "7.9"));
        films.add(new DataMarvelDC("Captain Marvel", "Action", "123", "2019", "7.0"));
        films.add(new DataMarvelDC("The Incredible Hulk", "Action", "112", "2008", "6.7"));
        films.add(new DataMarvelDC("Thor", "Action", "115", "2011", "7.0"));
        films.add(new DataMarvelDC("Spider-Man: Homecoming", "Action", "133", "2017", "7.4"));
        films.add(new DataMarvelDC("Batman Begins", "Action", "140", "2005", "8.3"));
        films.add(new DataMarvelDC("The Dark Knight Rises", "Action", "164", "2012", "8.4"));
        films.add(new DataMarvelDC("Suicide Squad: Kill the Justice League", "Action", "98", "2022", "7.1"));
        films.add(new DataMarvelDC("The New Mutans", "Horror", "98", "2020", "5.3"));
        films.add(new DataMarvelDC("Fantastoc Four (2005)", "Action", "106", "2005", "5.7"));
        films.add(new DataMarvelDC("Fantastoc Four: Rise of the Silver Surfer", "Action", "92", "2007", "5.6"));
        films.add(new DataMarvelDC("The Losers", "Action", "97", "2010", "6.0"));
        films.add(new DataMarvelDC("Constantine", "Action", "121", "2005", "7.0"));
        films.add(new DataMarvelDC("Green Lantern", "Action", "114", "2011", "5.5"));
        films.add(new DataMarvelDC("Hellboy (2004)", "Action", "122", "2004", "6.8"));
        films.add(new DataMarvelDC("Hellboy II: The Golden Army", "Action", "120", "2008", "6.8"));
        films.add(new DataMarvelDC("Blade (1998)", "Action", "120", "1998", "7.1"));
        films.add(new DataMarvelDC("Blade II", "Action", "112", "2002", "6.7"));
        films.add(new DataMarvelDC("Blade: Trinity", "Action", "123", "2004", "5.9"));
        films.add(new DataMarvelDC("The Green Hornet", "Action", "119", "2011", "6.1"));
        films.add(new DataMarvelDC("Hancock", "Action", "92", "2008", "6.4"));
        films.add(new DataMarvelDC("Kick-Ass", "Action", "117", "2010", "7.6"));
        films.add(new DataMarvelDC("Kick-Ass 2", "Action", "103", "2013", "6.5"));
        films.add(new DataMarvelDC("The Mask", "Action", "101", "1994", "6.9"));
        films.add(new DataMarvelDC("Spawn", "Action", "96", "1997", "5.2"));
        films.add(new DataMarvelDC("Watchmen", "Action", "163", "2009", "8.0"));
        films.add(new DataMarvelDC("The Incredibles", "Animation", "115", "2004", "8.0"));
        films.add(new DataMarvelDC("The Incredibles 2", "Animation", "118", "2018", "7.6"));
        films.add(new DataMarvelDC("Batman: Mask of the Phantasm", "Animation", "76", "1993", "8.0"));
        films.add(new DataMarvelDC("Batman Beyond: Return of the Joker", "Animation", "76", "2000", "7.8"));
        films.add(new DataMarvelDC("Spider-Man: Into the Spider-Verse", "Animation", "117", "2018", "8.4"));
        films.add(new DataMarvelDC("Spider-Man: Across the Spider-Verse", "Animation", "140", "2023", "8.5"));
        films.add(new DataMarvelDC("Superman: Red Son", "Animation", "84", "2020", "7.0"));
        films.add(new DataMarvelDC("The Lego Batman Movie", "Animation", "104", "2017", "7.3"));
        films.add(new DataMarvelDC("Justice League: War", "Animation", "79", "2014", "7.3"));
        films.add(new DataMarvelDC("Batman: The Killing Joke", "Animation", "77", "2016", "6.9"));
        films.add(new DataMarvelDC("Teen Titans Go! To the Movies", "Animation", "84", "2018", "6.7"));
        films.add(new DataMarvelDC("Captain Marvel", "Action", "123", "2019", "7.0"));
        films.add(new DataMarvelDC("Justice League: The Flashpoint Paradox", "Animation", "81", "2013", "8.0"));
        films.add(new DataMarvelDC("Teen Titans: The Judas Contract", "Animation", "84", "2017", "7.5"));
        films.add(new DataMarvelDC("Superman: Man of Tomorrow", "Animation", "90", "2020", "7.0"));
        films.add(new DataMarvelDC("Wonder Woman: Bloodlines", "Animation", "83", "2009", "7.0"));
        films.add(new DataMarvelDC("Superman/Batman: Public Enemies", "Animation", "90", "2009", "7.3"));
        films.add(new DataMarvelDC("Batman: Under the Red Hood", "Animation", "75", "2010", "8.0"));
        films.add(new DataMarvelDC("Batman: Bad Blood", "Animation", "72", "2016", "7.2"));
        films.add(new DataMarvelDC("Batman: The Dark Knight Returns", "Animation", "148", "2012", "8.4"));
        films.add(new DataMarvelDC("Justice League: Throne of Atlantis", "Animation", "72", "2015", "7.0"));
        films.add(new DataMarvelDC("Justice League: War", "Animation", "79", "2014", "7.3"));
        films.add(new DataMarvelDC("Batman and Harley Quinn", "Animation", "74", "2017", "7.1"));
        films.add(new DataMarvelDC("Batman: Soul of the Dragon", "Animation", "83", "2021", "7.0"));
        films.add(new DataMarvelDC("Superman: The Animated Series", "Animation", "72", "1996", "7.4"));
        films.add(new DataMarvelDC("Green Lantern: First Flight", "Animation", "82", "2009", "7.3"));
        films.add(new DataMarvelDC("Green Lantern: Emerald Knights", "Animation", "83", "2010", "7.1"));
        films.add(new DataMarvelDC("Batman: Year One", "Animation", "64", "2011", "7.4"));
        films.add(new DataMarvelDC("Justice League: Doom", "Animation", "75", "2012", "7.8"));
        films.add(new DataMarvelDC("Batman: Mask of the Phantasm", "Animation", "76", "1993", "8.0"));
        films.add(new DataMarvelDC("Superman: The Movie", "Action", "143", "1978", "7.3"));
        films.add(new DataMarvelDC("Superman II", "Action", "127", "1980", "6.8"));
        films.add(new DataMarvelDC("Superman III", "Action", "125", "1983", "5.8"));
        films.add(new DataMarvelDC("Superman IV: The Quest for Peace", "Action", "90", "1987", "3.7"));
        films.add(new DataMarvelDC("The Crow", "Action", "102", "1994", "7.6"));
        films.add(new DataMarvelDC("The Shadow", "Action", "108", "1994", "6.0"));
        films.add(new DataMarvelDC("Judge Dredd", "Action", "96", "1995", "5.6"));
        films.add(new DataMarvelDC("Demolition Man", "Action", "115", "1993", "6.7"));
        films.add(new DataMarvelDC("Mystery Man", "Action", "121", "1999", "6.1"));
        films.add(new DataMarvelDC("The Panthom", "Action", "94", "1996", "5.5"));
        films.add(new DataMarvelDC("Men in Black", "Action", "98", "1997", "7.3"));
        films.add(new DataMarvelDC("Men in Black II", "Action", "88", "2002", "6.1"));
        films.add(new DataMarvelDC("Men in Black 3", "Action", "106", "2012", "6.8"));
        // films.add(new DataMarvelDC("Mystery Man", "Action", "121", "1999", "6.1"));
        films.add(new DataMarvelDC("The Rockerter", "Action", "108", "1991", "6.9"));
        films.add(new DataMarvelDC("The Adventure of Tintin", "Animation", "107", "2011", "7.3"));
        films.add(new DataMarvelDC("Watchmen: Tales of the Black Freighter", "Animation", "86", "2009", "7.4"));
        // films.add(new DataMarvelDC("The Incredible Hulk", "Action", "112", "2008", "6.7"));
        films.add(new DataMarvelDC("The Incredible Hulk", "Action", "112", "2008", "6.7"));
        films.add(new DataMarvelDC("Deadpool 2", "Action", "119", "2018", "7.7"));
        films.add(new DataMarvelDC("Logan: The Wolverine", "Action", "137", "2017", "8.1"));
        films.add(new DataMarvelDC("X-Men Origins: Wolverine", "Action", "107", "2009", "6.6"));
        films.add(new DataMarvelDC("X2: X-Men United", "Action", "133", "2003", "7.4"));
        films.add(new DataMarvelDC("X-Men: The Last Stand", "Action", "104", "2006", "6.7"));
        films.add(new DataMarvelDC("X-Men: Dark Phoenix", "Action", "114", "2019", "6.0"));
        films.add(new DataMarvelDC("X-Men: First Class", "Action", "132", "2011", "7.7"));
        films.add(new DataMarvelDC("Batman: The Long Halloween, Part One", "Animation", "83", "2021", "7.4"));
        films.add(new DataMarvelDC("Batman: The Long Halloween, Part Two", "Animation", "87", "2021", "7.5"));
        films.add(new DataMarvelDC("Green Lantern: Beware My Power", "Animation", "87", "2022", "7.0"));
        films.add(new DataMarvelDC("Spider-Man: The Animated Series", "Animation", "24", "1994", "7.5"));
        films.add(new DataMarvelDC("Spider-Man 2: Enter the Spider-Verse", "Animation", "140", "2023", "8.5"));
        films.add(new DataMarvelDC("Spider-Man: Edge of Time", "Video Game", "120", "2010", "7.6"));
        films.add(new DataMarvelDC("The Flash: The Fastest Man Alive", "Animation", "87", "2022", "7.0"));
        films.add(new DataMarvelDC("Batman: The Telltale Series", "Video Game", "250", "2016", "7.9"));
        films.add(new DataMarvelDC("Marvel's Daredevil", "TV Series", "60", "2015", "8.6"));
        films.add(new DataMarvelDC("Marvel's Luke Cage", "TV Series", "60", "2016", "7.8"));
        films.add(new DataMarvelDC("Marvel's Jessica Jones", "TV Series", "60", "2015", "8.0"));
        films.add(new DataMarvelDC("Marvel's The Punisher", "TV Series", "50", "2017", "8.5"));
        films.add(new DataMarvelDC("Marvel's Iron Fist", "TV Series", "60", "2017", "6.5"));
        films.add(new DataMarvelDC("DC's Legends of Tomorrow", "TV Series", "42", "2016", "6.9"));
        films.add(new DataMarvelDC("The Flash (TV Series)", "TV Series", "43", "2014", "7.7"));
        films.add(new DataMarvelDC("Arrow (TV Series)", "TV Series", "42", "2012", "7.5"));
        films.add(new DataMarvelDC("Supergirl (TV Series)", "TV Series", "42", "2015", "6.9"));
        films.add(new DataMarvelDC("Titans (TV Series)", "TV Series", "50", "2018", "7.7"));
        films.add(new DataMarvelDC("The Boys (TV Series)", "TV Series", "60", "2019", "8.7"));
        films.add(new DataMarvelDC("Doom Patrol (TV Series)", "TV Series", "60", "2019", "7.8"));
        films.add(new DataMarvelDC("The Umbrella Academy (TV Series)", "TV Series", "60", "2019", "8.0"));
        films.add(new DataMarvelDC("The Sandman (TV Series)", "TV Series", "60", "2022", "8.0"));
        films.add(new DataMarvelDC("Stargirl (TV Series)", "TV Series", "42", "2020", "7.3"));
        films.add(new DataMarvelDC("Superman & Lois (TV Series)", "TV Series", "43", "2021", "7.7"));
        films.add(new DataMarvelDC("The Witcher (TV Series)", "TV Series", "60", "2019", "8.2"));
        films.add(new DataMarvelDC("Marvel's What If...?", "TV Series", "30", "2021", "7.7"));
        films.add(new DataMarvelDC("DC's Stargirl", "TV Series", "42", "2020", "7.3"));
        films.add(new DataMarvelDC("Marvel's Agents of S.H.I.E.L.D.", "TV Series", "42", "2013", "7.5"));
        return films;
    }
}
