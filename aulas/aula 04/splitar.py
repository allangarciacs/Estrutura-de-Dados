from glicenia import glicenia
lista = []

linha = "120,11/02/2026,9:00"

vetor_linha = linha.split(",")

obj = glicenia(int(vetor_linha[0],vetor_linha[1],vetor_linha[2]))

if obj not in lista:
    lista.append(obj)
    