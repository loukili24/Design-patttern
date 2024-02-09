package com.floukili.org.design.patterns.Strategy;

public class ConcreteStrategyA implements Strategy {
    @Override
    public void execute() {
        System.out.println("Executing ConcreteStrategyA");
        int[] arrayToSort = {5, 2, 8, 1, 7};
        sortArray(arrayToSort);
    }

    private void sortArray(int[] array) {
    	for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Échangez les éléments si nécessaire
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    	 System.out.print("Sorted array: ");
         for (int value : array) {
             System.out.print(value + " ");
         }
         System.out.println();
     }
 }