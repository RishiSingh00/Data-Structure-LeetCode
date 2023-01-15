**Efficient Minimized Binary Search**
```
while(l <= r) {                     //binarySearch on arr of start points
int mid = (l + ((r - l) / 2));
if(sp[mid] >= ep) {
min = sp[mid];
found = true;
r = mid - 1;
}
else {
l = mid + 1;
}
}
```