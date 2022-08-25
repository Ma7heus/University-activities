a, b, c = map(float, input().split())
if a < c:
    a, c = c, a
if a < b:
    a, b = b, a
if b < c:
    b, c = c, b
if a >= b+c: 
    print("NAO FORMA TRIANGULO")
else:
    if a**2 == b**2 + c**2: 
        print("TRIANGULO RETANGULO")
    if a**2 > b**2 + c**2: 
        print("TRIANGULO OBTUSANGULO")
    if a**2 < b**2 + c**2: 
        print("TRIANGULO ACUTANGULO")
    if a == b and a == c: 
        print("TRIANGULO EQUILATERO")
    if (a == b and b != c) or (b == c and c != a) or (c == a and a != b) : 
        print("TRIANGULO ISOSCELES")