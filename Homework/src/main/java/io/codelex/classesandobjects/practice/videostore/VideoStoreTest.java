package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0 -> System.exit(0);
                case 1 -> fillVideoStore(keyboard, videoStore);
                case 2 -> rentVideo(keyboard, videoStore);
                case 3 -> returnVideo(keyboard, videoStore);
                default -> {
                }
            }

        }
    }

    private static void fillVideoStore(Scanner scanner, VideoStore videoStore) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            double rating = scanner.nextDouble();
            //todo - add video
            Video video = new Video(movieName);
            video.receiveRating(rating);
            videoStore.addVideo(video);
        }
        Video video1 = new Video("The Matrix");
        videoStore.addVideo(video1);

        Video video2 = new Video("Godfather II");
        videoStore.addVideo(video2);

        Video video3 = new Video("Star Wars Episode IV: A New Hope");
        videoStore.addVideo(video3);
    }


    private static void rentVideo(Scanner scanner, VideoStore videoStore) {
        //todo - rent video
        System.out.println("Enter the title of the video You wish to rent: ");
        String title = scanner.next();
        videoStore.checkOutVideo(title);
    }

    private static void returnVideo(Scanner scanner, VideoStore videoStore) {
        //todo - return video
        System.out.println("Enter the title of the video You wish to return: ");
        String title = scanner.next();
        videoStore.returnVideo(title);
    }
}
