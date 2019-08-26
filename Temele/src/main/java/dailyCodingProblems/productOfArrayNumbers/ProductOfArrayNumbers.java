package dailyCodingProblems.productOfArrayNumbers;

class ProductOfArrayNumbers {
    int[] arrayProduct(int[] arr) {
        if (arr == null) {
            return new int[]{0};
        }

        int[] arrProd = new int[arr.length];
        for (int i = 0; i < arrProd.length; i++) {
            int prod = 1;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    prod = prod * arr[j];
                }
            }
            arrProd[i] = prod;
        }
        return arrProd;
    }
}
