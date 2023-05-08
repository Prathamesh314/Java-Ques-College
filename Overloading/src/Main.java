// We were taught about function overloading
// Function overloading is a concept in which we write same function name in class and just varry it's parameters

// public class Main {
//     public static void main(String[] args) {
//         OnlineShoppingPortal regular = new OnlineShoppingPortal();
//         OnlineShoppingPortal premium = new OnlineShoppingPortal();
//         System.out.printf("Regular : %f\n", regular.checkout(500, "prat99"));
//         System.out.printf("Premium : %f\n", premium.checkout(2000));
//         System.out.printf("Amount of regular customer : %f\n", regular.checkout(630, "Prat99"));
//         System.out.printf("Amount of premium customer : %f\n", regular.checkout(2000));
//     }

// }

public class Main {
    public static void main(String[] args) {
        Shape s = new Shape();
        // Volume of cube
        System.out.printf("Volume of Cube: %f\n", s.Volume(10));
        System.out.printf("Volume of Cuboid: %f\n", s.Volume(12.3, 33.4, 13.23));
        System.out.printf("Volume of Cylinder: %f\n", s.Volume(99.87, 10.5));
        System.out.printf("Volume of sphere: %f\n", s.Volume(55.23));
    }
}

class Shape {
    double Volume(int a) {
        return a * a * a;
    }

    double Volume(double r) {
        return (4 * Math.PI * r * r * r) / 3;
    }

    double Volume(double l, double h, double b) {
        return l * b * h;
    }

    double Volume(double r, double h) {
        return Math.PI * r * r * h;
    }

}