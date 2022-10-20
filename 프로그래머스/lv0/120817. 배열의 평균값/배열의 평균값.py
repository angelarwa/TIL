def solution(numbers):
    answer = 0
    i = 1
    for i in numbers:
        answer += i
    answer /= len(numbers)
    return answer