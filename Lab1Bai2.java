package hoclai;

import java.util.Scanner;

public class Lab1Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chieu dai:");
        double dai = scanner.nextDouble();
        System.out.println("Chieu rong:");
        double rong = scanner.nextDouble();
        double dientich = dai*rong;
        double chuvi = (dai+rong)*2;
        double canhnhonhat = Math.min(dai, rong);
        System.out.println("Dien tich: "+dientich);
        System.out.println("Chu vi: "+chuvi);
        System.out.println("Canh nho nhat"+rong);
    }    
}
