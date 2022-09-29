num1, num2, num3 = map(int, input().split())

maior12 = (num1 + num2 + abs(num1-num2))/2
maior3 =  (maior12 + num3 + abs(maior12-num3))/2

print(f"{maior3:.0f} eh o maior")