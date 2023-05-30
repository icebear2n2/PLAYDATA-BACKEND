import java.util.Arrays;

public class Example7 {
    public static void main(String[] args) {
        String excel2 = "수\t상호명\t좌표\t지역\n" +
                "1\t피자\t37.01,127.01\t대구\n" +
                "2\t치킨\t37.03,127.02\t대전\n" +
                "3\t햄버거\t37.13,127.02\t서울\n" +
                "4\t감자탕\t36.13,127.02\t부산";


        for (int i=1; i<excel2.split("\n").length; i++) {
            String[] arr = excel2.split("\n");

            for (String line : Arrays.asList(arr[i])) {
                String[] arr2 = line.split("\t");
                Food food = new Food(arr2[0], arr2[1], arr2[2], arr2[3]);
                
                System.out.println("{" + "number: " + food.getNumber() + ", name: " + food.getName() + ", coordinate: " + Arrays.toString(food.getCoordinate()) + ", region: " + food.getRegion() + "}");
            }
        }
    }
}

class Food {

    private String number;
    private String name;
    private float[] coordinate;
    private String region;

    public Food(String number, String name, String coordinate, String region) {
        this.number = number;
        this.name = name;
        float[] tmp = new float[2];
        tmp[0] = Float.parseFloat(coordinate.split(",")[0]);
        tmp[1] = Float.parseFloat(coordinate.split(",")[1]);
        this.coordinate = tmp;
        this.region = region;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public float[] getCoordinate() {
        return coordinate;
    }

    public String getRegion() {
        return region;
    }
}