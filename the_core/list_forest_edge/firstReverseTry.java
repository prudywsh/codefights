int[] firstReverseTry(int[] arr) {
    if (arr.length > 0) {
        int t = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = t;
    }
    return arr;
}
