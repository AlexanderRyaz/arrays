public class Main {
    public static void main(String[] args) {
        int[] arrays = new int[3];
        arrays[0] = 1; arrays[1] = 2; arrays[2] = 3;
        for (int i = arrays.length - 1; i >= 0; i--) {
            System.out.print(arrays[i] + ","); }

        System.out.println();

        double[] doubleArr = new double[] {1.57, 7.654, 9.986};
        for (int i = doubleArr.length - 1; i >= 0; i--) {
            System.out.print(doubleArr[i]  + ","); }

        System.out.println();

        String[] names = {"Таня", "Ника", "Саша"};
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i] + ","); }



    }
}