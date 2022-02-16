const binary_search = (search_array, target) => {
    let first = 0
    let last = search_array.length - 1

    while (first <= last) {
        midpoint = Math.floor((first + last) / 2)

        if (search_array[midpoint] === target) {
            return midpoint
        } else if (search_array[midpoint] < target) {
            first = midpoint + 1
        } else {
            last = midpoint - 1
        }
    }

    return null
}

const verify = (index) => {
    if (index) {
        console.log('Target found at index: ' + index.toString())
    } else {
        console.log('Target not found')
    }
}


const main = () => {
    const numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

    const result = binary_search(numbers, 12)
    verify(result)

    const result_2 = binary_search(numbers, 2)
    verify(result_2)
}

main()