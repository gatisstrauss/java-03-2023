package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;
import java.util.List;

public class VideoStore {
    List<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void addVideo(Video video) {
        inventory.add(video);
        System.out.println("Video " + video.getTitle() + " added to the inventory");
    }

    public void checkOutVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.checkOut();
                return;
            }
        }
        System.out.println("Video " + title + " is not available");
    }

    public void returnVideo(String title) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.returnVideo();
                return;
            }
        }
        System.out.println("Video '" + title + " is not available");
    }

    public void receiveRating(String title, double rating) {
        for (Video video : inventory) {
            if (video.getTitle().equals(title)) {
                video.receiveRating(rating);
                return;
            }
        }
        System.out.println("Video '" + title + "' is not available in the inventory.");
    }

    public void inventoryList() {
        System.out.println("Inventory:");
        for (Video video : inventory) {
            System.out.println("Title:" + video.getTitle()
                    + ", Checked out: " + (video.isCheckedOut() ? "Yes" : "No")
                    + ", Average rating: " + video.getUserRating());

        }
    }
}

