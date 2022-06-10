A, B, C = map(int,input().split())

if A == B+C or B==A+C or C==A+B or A==B or A==C or C==B:
    print("S")
else:
    print("N")