public class Calculate {
    public static void calculatePerimeter(int firstSide, int secondSide, int thirdSide, String messageSout){
        if (firstSide <0 || secondSide <0 || thirdSide <0){
            throw new RuntimeException("The side of triangle can't be less than zero. Check value of firstSide " + firstSide + " secondSide " + secondSide + " thirdSide " + thirdSide);
        }
        int perimeter = firstSide+secondSide+thirdSide;
        System.out.println(messageSout + perimeter);
    }
}
