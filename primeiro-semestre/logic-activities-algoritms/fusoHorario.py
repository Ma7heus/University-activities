S, T, F = map(int,input().split())

horaChegada = 0

horaChegada = S+T+F
if horaChegada >= 24:
    horaChegada = horaChegada -24
elif horaChegada < 0:
    horaChegada = horaChegada + 24
print(horaChegada)