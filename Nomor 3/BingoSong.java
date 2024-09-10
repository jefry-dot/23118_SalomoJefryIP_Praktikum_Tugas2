public class BingoSong {

    private String name;
    private String songLyrics;

    // Konstruktor
    public BingoSong(String name) {
        this.name = name;
        this.songLyrics = generateSong(); // Lirik dihasilkan sekali saat objek dibuat
    }

    // Method untuk menghasilkan lirik lagu Bingo sebagai satu string
    private String generateSong() {
        StringBuilder lyricsBuilder = new StringBuilder();
        String originalName = this.name;

        for (int i = 0; i <= name.length(); i++) {
            // Bagian pertama: There was a farmer who had a dog, And Bingo was his name-o.
            lyricsBuilder.append("There was a farmer who had a dog,\n");
            lyricsBuilder.append("And " + originalName + " was his name-o.\n");
            
            // Bagian kedua: B-I-N-G-O / (clap)-I-N-G-O, dll.
            for (int j = 0; j < 3; j++) {
                lyricsBuilder.append(getClapName(i) + "\n");
            }

            // Bagian ketiga: And Bingo was his name-o.
            lyricsBuilder.append("And " + originalName + " was his name-o.\n\n");
        }

        return lyricsBuilder.toString(); // Mengembalikan lirik lengkap sebagai string
    }

    // Method untuk mengembalikan nama dengan clap
    private String getClapName(int clapCount) {
        StringBuilder clapNameBuilder = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            if (i < clapCount) {
                clapNameBuilder.append("(clap)-");
            } else {
                clapNameBuilder.append(name.charAt(i) + "-");
            }
        }
        return clapNameBuilder.toString();
    }

    // Method untuk menampilkan lirik beberapa kali
    public void singMultipleTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(songLyrics); // Menampilkan lirik lengkap
        }
    }

    public static void main(String[] args) {
        BingoSong song = new BingoSong("BINGO");
        song.singMultipleTimes(3); // Memanggil lirik 3 kali
    }
}
