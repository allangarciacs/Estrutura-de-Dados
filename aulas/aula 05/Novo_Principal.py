from clima import Clima

lista = [] # cria lista
nome_base = "dados.csv" # nome do arquivo em quer manipular

# escala a temperatura
escala_temp = {
    "Frio": 1,
    "Ameno": 2,
    "Quente": 3
}

try:
    # abrindo o arquivo no modo leitura
    leitor = open(nome_base, "r", encoding="utf-8")

    # passando o arquivo linha por linha e tratandoa os objetos
    for linha in leitor:
        dados_linha = linha.split(",")

        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])
        
        if obj_clima not in lista:
            lista.append(obj_clima)

        # exebindo a lista sem 'enter' - print(linha,end="") printa a lista, o 'end=""'
        for item in lista:               # serve para remover os 'enter's'
            print(item, end="")

    # fechando o arquivo
    leitor.close()  

    contagem = {} # guarda quantas vezes cada mes foi 'quente'

    # percorre todos os dados da lista
    for item in lista:
        if item.temperatura == "Quente":
         if item.mes in contagem:
             contagem[item.mes] += 1
         else:
             contagem[item.mes] = 1

    mes_mais_quente = None
    maior = 0

    for mes in contagem:
        if contagem[mes] > maior:
            maior = contagem[mes]
            mes_mais_quente = mes

    print("\nMes q foi 'quente' mais vezes:")

    if mes_mais_quente is not None:
        print(mes_mais_quente, "-", maior, "vezes")
    else:
        print("Nenhum mes com 'Quente'")

except Exception as e:
    print("ocorreu algum erro..", e)
    
