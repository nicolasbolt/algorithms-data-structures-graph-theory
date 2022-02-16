
def merge_sort(list):
    """
    Sorts a list in ascending order
    Returns a new sorted list

    Takes O(n log n) time
    """

    if len(list) <= 1:
        return list

    # Divide: Find midpoint and divide into sublists
    left_half, right_half = split(list)

    # Conquer: Recursively sort the sublists created in previous step
    left = merge_sort(left_half)
    right = merge_sort(right_half)

    # Combine: Merge the sorted sublists created in previous step
    return merge(left, right)

def split(list):
    """
    Divide the unsorted list at midpoint into sublists
    Returns two sublists - left and right

    Takes overal O(log n) time
    """

    mid = len(list) // 2
    left = list[:mid]
    right = list[mid:]

    return left, right

def merge(left, right):
    """
    Merges two lists, sorting them in the process
    Returns a new merged list

    Runs in overall O(n) time
    """
    
    l = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] < right[j]:
            l.append(left[i])
            i += 1
        else:
            l.append(right[j])
            j += 1

    while i < len(left):
        l.append(left[i])
        i += 1

    while j < len(right):
        l.append(right[j])
        j += 1

    return l


def verify_sorted(list):
    n = len(list)

    if (n == 0 or n == 1):
        return True

    return list[0] < list[1] and verify_sorted(list[1:])

if __name__ == '__main__':
    test_list = [64, 21, 89, 90, 34, 54, 1, 77]
    print(verify_sorted(test_list))
    sorted_list = merge_sort(test_list)
    print(verify_sorted(sorted_list))