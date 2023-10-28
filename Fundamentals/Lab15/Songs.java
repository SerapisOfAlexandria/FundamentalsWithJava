package Fundamentals.Lab15;

import java.util.Scanner;

public class Songs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(input.nextLine());
        String[] songs = new String[n];

        for (int i = 0; i <= n - 1; i++) {
            songs[i] = input.nextLine();
        }

        String playlistName = input.nextLine();

        Music[] listSongs = new Music[n];

        for (int i = 0; i <= n - 1; i++) {
            String[] songDetails = songs[i].split("_");
            listSongs[i] = new Music(songDetails[0], songDetails[1], songDetails[2]);

            if (listSongs[i].typeList.equals(playlistName) || playlistName.equals("all")) {
                System.out.println(listSongs[i].name);
            }
        }
    }
}

class Music {
    String typeList, name, time;

    public Music(String typeList, String name, String time) {
        this.name = name;
        this.typeList = typeList;
        this.time = time;
    }

}
