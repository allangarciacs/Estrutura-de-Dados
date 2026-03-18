from clima import Clima

lista = [] # cria lista
nome_base = "dados.csv" # nome do arquivo em quer manipular

try: # utiliza o 'try' para saber se ocorreu um erro nessa área

    # abrindo o arquivo no modo leitura
    leitor = open(nome_base, "r", encoding="utf-8")

    # passando o arquivo linha por linha e tratandoa os objetos
    for linha in leitor:
        dados_linha = linha.split(",")
        obj_clima = Clima(dados_linha[0], dados_linha[1], dados_linha[2], dados_linha[3])

        if obj_clima not in lista:
            lista.append(obj_clima)
        # exebindo a lista sem 'enter'
        for item in lista:
            print(item, end="")


        # print(linha,end="") printa a lista, o 'end=""' serve para remover os 'enter's'  

    # fechando o arquivo
    leitor.close   
except Exception as e:
    print("ocorreu algum erro..", e) # se ocorrer um erro aqui, essa
                                     # mensagem aparece-rá
    
    
