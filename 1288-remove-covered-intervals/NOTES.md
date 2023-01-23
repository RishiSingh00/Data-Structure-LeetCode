​
static void swap(int[][] arr, int j) {
​
for(int i = 0 ; i < arr.length ; i++){
​
int temp = arr[i][j];
arr[i][j] = arr[i][j+1];
arr[i][j+1] = temp;
}
}
​
static void sort(int[][] arr, int index) {
​
for(int i = 0 ; i < arr[0].length ; i++) {
​
for(int j = 0 ; j < arr[0].length-i-1 ; j++) {
​
if(arr[index][j]>arr[index][j+1]) {
swap(arr,j);
}
}
}
}