#Codigo que recebe um valor N de alunos e calcula sua media final em tres avaliacoes, 
# dizendo se esta aprovado ou nao.

QuantAluno = int(input("Digite a quantidade de alunos que deseja calcular: "))
QuantAluno+=1
nota = 0
media = 0
somaNota = 0
for n in range(1,QuantAluno):
    for i in range(1,4):
        nota = float(input(f"Digite a nota da prova {i} do aluno {n}: "))
        somaNota = somaNota + nota
    media = somaNota/3
    if media < 6:
        print(f"O aluno {n} esta REPROVADO!")
        print(media)
    else:
        print(f"O aluno {n} esta APROVADO!")
        print(media)

print("fim da execusao!")
    