const linear_search = (search_array, target) => {
    for (let i = 0; i < search_array.length; i++) {
        if (search_array[i] === target) {
            return i;
        }
    }

    return null;
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

    const result = linear_search(numbers, 12)
    verify(result)

    const result_2 = linear_search(numbers, 6)
    verify(result_2)
}

main()