def hamming(code):
    bits = [int(c) for c in code]

    p1 = (bits[0] + bits[2] + bits[4] + bits[6]) % 2
    p2 = (bits[1] + bits[2] + bits[5] + bits[6]) % 2
    p3 = (bits[3] + bits[4] + bits[5] + bits[6]) % 2
    
    error_pos = p1 * 1 + p2 * 2 + p3 * 4

    if error_pos != 0:
        print(f"Ошибка в бите {error_pos}")
        bits[error_pos - 1] = 1 - bits[error_pos - 1]
    else:
        print("Ошибки нет")

    data = [bits[2], bits[4], bits[5], bits[6]]
    result = ''.join(map(str, data))

    print(f"Информационные биты: {result}")
    return result


print("Введите 7 бит:")
user_input = input().strip()

if len(user_input) != 7 or not all(c in '01' for c in user_input):
    print("Ошибка: нужно ровно 7 цифр 0 или 1")
else:
    hamming(user_input)
