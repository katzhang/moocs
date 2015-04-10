def insertionSort(list):
    length = len(list)
    for i in range(length):
        for j in range(i):
            if list[i] < list[j]:
                list.insert(j, list.pop(i))


listA = [34, 90, 19, 87, 10, 73]
insertionSort(listA)
print(listA)