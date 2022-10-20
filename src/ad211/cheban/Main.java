package ad211.cheban;

public class Main {
    public static void main(String[] args) {
        final int min = -99; // значення мінімуму
        final int max = 99; // значення максимуму
        int n = 5, m = 8; // розмір строк та стовпців відповідно
        int[][] arr = new int [n][m]; // ініціалізація масиву
        for (int i = 0; i < arr.length; i++){ // заповнення масиву випадковими числами в діапазоні від -99 до 99
            for (int j = 0; j < arr[i].length; j++){
            arr[i][j] = (int)(Math.random()*(max-min+1)+min);
        }
    }
        // виведення методів
    printArr(arr);
    System.out.print("Значення максимального елементу масиву: ");
    System.out.println(getMax(arr));}
    public static void printArr(int[][]arr) { // метод виводу масиву в консоль
        System.out.println("Масив: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static int getMax(int[][]arr) { // метод пошуку максимального значення в масиві
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max){
                    max = arr[i][j];}
            }
        }
        return max;
    }
}