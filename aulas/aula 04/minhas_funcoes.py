from glicenia import glicenia

def popular_lista_arquivo(lista, nome_base):
    #ler do arquivo e popular a lista com dados aplitados

    leitor = open(nome_base,"r",encoding="utf8")
    for linha in leitor:
        vetor_linha = linha.split(",")
    obj = glicenia(int(vetor_linha[0]),vetor_linha[1],vetor_linha[2])

    if obj not in lista:
        lista.append( obj )

    leitor.close()

def exibir_lista(lista):
    for item in lista:
        print(item.valor)         

    print("total de dados da base: ", len(lista))

def calcular_media(lista):
    soma = 0
    for item in lista: 
        soma += item.valor

    return int(soma/len(lista))

def calcular_mediana(lista):
    nova_lista[]
    lista.sort(key=lambda g: g.valor)
    print(nova_lista)