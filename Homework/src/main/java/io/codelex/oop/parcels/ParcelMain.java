package io.codelex.oop.parcels;

public class ParcelMain {
    public static void main(String[] args) {

        Parcel parcel1 = new Parcel(50, 60, 70, 25.0f, false);
        Parcel parcel2 = new Parcel(100, 63, 90, 20.0f, true);
        Parcel parcel3 = new Parcel(30, 90, 12, 24.6f, false);
        Parcel parcel4 = new Parcel(17, 12, 110, 25.2f, true);

        validateParcel(parcel1);
        validateParcel(parcel2);
        validateParcel(parcel3);
        validateParcel(parcel4);
    }

    private static void validateParcel(Parcel parcel) {
        System.out.println("Parcel dimensions: " + parcel.getxLength() + "x" + parcel.getyLength() + "x" + parcel.getzLength());
        System.out.println("Parcel weight: " + parcel.getWeight());
        System.out.println("Is Express: " + parcel.isExpress());

        if (parcel.validate()) {
            System.out.println("Parcel is valid.");
        } else {
            System.out.println("Parcel is invalid.");
        }

        System.out.println();
    }
}

