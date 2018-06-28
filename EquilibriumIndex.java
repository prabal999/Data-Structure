package com.ph.datastructure.array;

/**
 * Equilibrium Index of an array. Asked in Tia Technology Pvt. Ltd.
 * http://www.tiatechnology.com/
 * @author Prabal Srivastava
 */
public class EquilibriumIndex {

    public static void main(String[] args) {
        int[] data = { -7, 1, 5, 2, -4, 3, 0 };
        EquilibriumIndex obj = new EquilibriumIndex();
        obj.getEquilibriumIndex(data);
        System.out.print("\n");
        obj.getEquilibriumIndexBestSolution(data);
    }

    /**
     * Solution of O(n^2) LHS = RHS
     * 
     * @param data - Given array of int.
     */
    public void getEquilibriumIndex(int[] data) {

        for(int i = 0; i < data.length; i++) {
            int lhs = 0;
            int rhs = 0;
            for(int j = 0; j < i; j++) {
                lhs += data[j];
            }

            for(int j = i + 1; j < data.length; j++) {
                rhs += data[j];
            }
            if(lhs == rhs) {
                System.out.print(i +", ");
            }
        }
    }

    /**
     * Solution of O(n) LHS = RHS
     * 
     * @param data - Given array of int.
     */
    public void getEquilibriumIndexBestSolution(int[] data) {
        int total = 0;
        for(int i = 0; i < data.length; i++) {
            total += data[i];
        }
        int leftSum = 0;
        for(int i = 0; i < data.length; i++) {
            total -= data[i];
            if(total == leftSum) {
                System.out.print(i +", ");
            }
            leftSum += data[i];
        }
    }

}
