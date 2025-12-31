class LSearch {
    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7};
        int key = 7;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}
