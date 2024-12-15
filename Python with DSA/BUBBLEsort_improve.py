a=[5,3,6,7,8,9,12,56,70,67]
n=len(a)
for i in range(n-1):
    swapped=False
    for j in range(n-1-i):
        if a[j]>a[j+1]:
            a[j],a[j+1]=a[j+1],a[j]
            swapped=True
    if not swapped:
        break
print("sorted array:",a)