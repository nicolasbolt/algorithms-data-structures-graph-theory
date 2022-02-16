const recursive_binary_search = (search_array, target) => {
    if (search_array.length === 0) {
        return false
    }

    const midpoint = Math.floor(search_array.length / 2)

    if (search_array[midpoint] === target) {
        return true
    }

    if (search_array[midpoint] < target) {
        return recursive_binary_search(search_array.slice(midpoint + 1, search_array.length), target)
    }

    return recursive_binary_search(search_array.slice(0, midpoint), target)
}

const verify = result => {
    console.log("Target found: " + result.toString())
}

const main = () => {
    const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    const result = recursive_binary_search(numbers, 12)
    verify(result)

    const result_2 = recursive_binary_search(numbers, 8)
    verify(result_2)
}

main()