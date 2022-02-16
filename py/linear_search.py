def linear_search(list, target):
    """
    Returns the index position of the element if found, else returns None
    """

    for i in range(0, len(list)):
        if list[i] == target:
            return i
    return None

def verify(index):
    if index is not None:
        print("Target found at index: " + str(index))
    else:
        print("Target not found in list")


if __name__ == '__main__':
    # value not in list
    numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
    result = linear_search(numbers, 12)
    verify(result)

    # value at index 5
    result_2 = linear_search(numbers, 6)
    verify(result_2)