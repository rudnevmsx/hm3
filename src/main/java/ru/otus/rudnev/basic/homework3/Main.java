package ru.otus.rudnev.basic.homework3;


public class Main {
    public static void main(String[] args) {
        sumOfPositiveElements(new int[][]{{1,2,3},{1,3,4}});
        secondTask(4);
        thirdTask(new int[][]{{1,2},{1,3},{1,8}});
        findMax(new int[][]{{7,8,4},{4,7,2},{16,1,2}});
        fifthTask(new int[][]{{1,2,3},{4,5,6},{8,3,7}});
    }

    public static void sumOfPositiveElements(int [][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length;j++){
                if(arr[i][j] > 0){
                    sum += arr[i][j];
                }
            }
        }
        System.out.println("Сумма элементов > 0: " + sum);
    }

    public static void secondTask(int value){
        for (int i = 0; i < value; i++) {
            for (int j = 0; j < value; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
    //и что будет если пришлют прямоугольный массив?
    public static void thirdTask(int [][] arr){
        int size = arr.length;

        for (int i = 0; i < size ; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i == j){
                    arr[i][j] = 0;
                }
            }

        }

        //Вывод готового массива
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    //а что будет если пришлют массив с одними отрицательными числами?
    public static void findMax(int [][] arr){
        int maxValue = 0;
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(Math.abs(arr[i][j]) > Math.abs(maxValue)){
                    maxValue = arr[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент массива: " + maxValue);
    }

    //вернуть != распечатать
    public static int fifthTask(int [][] arr){
        int sum = 0;
        if (arr.length < 2){
            return -1;
        }
        for (int j = 0; j < arr[1].length; j++) {
            sum += arr[1][j];
        }
        return sum;
    }
}