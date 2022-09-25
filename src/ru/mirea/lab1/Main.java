package ru.mirea.lab1;

public class Main {

    public static void main(String[] args) {
        int tab[] = {1,2,3,4,5,6,7,8,9,10};
        double sum = 0;
        double avg = 0;
        System.out.println(tab[0]);
        for (int i = 0 ; i < 10 ; i++) {
            sum += tab[i];
        }
        avg = sum / tab.length;
        System.out.println("La somme est : " + sum);
        System.out.println("La moyenne est : " + avg);
    }
}
