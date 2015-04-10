# sort into ascending order

def selectionSort(list):
    length = len(list)
    for i in range(length):
        min = i
        for j in range(i+1, length):
            if list[j] < list[min]:
                min = j
        temp = list[i]
        list[i] = list[min]
        list[min] = temp


listA = [34, 90, 19, 87, 10, 73]
selectionSort(listA)
print(listA)