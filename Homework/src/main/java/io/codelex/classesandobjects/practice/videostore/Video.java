package io.codelex.classesandobjects.practice.videostore;

public class Video {
    String title;
    boolean checkedOut;
    double userRating;

    public Video(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public double getUserRating() {
        return userRating;
    }

    public void checkOut() {
        if (!checkedOut) {
            checkedOut = true;
            System.out.println("Video " + title + " has been checked out");
        } else {
            System.out.println("Video " + title + " is already checked out");
        }
    }

    public void returnVideo() {
        if (checkedOut) {
            checkedOut = false;
            System.out.println("Video " + title + " has been returned");
        } else {
            System.out.println("Video " + title + " is already returned");
        }
    }

    public void receiveRating(double rating) {
        userRating = (userRating + rating) / 2;
        System.out.println("Rating " + rating + " received for video " + title);
    }
}
