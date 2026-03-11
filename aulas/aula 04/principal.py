from glicenia import glicenia
from minhas_funcoes import popular_lista_arquivo, exibir_lista, calcular_media, calcular_mediana

lista = []
nome_base = "dados.csv"

popular_lista_arquivo(lista, nome_base)
exibir_lista(lista)

media = calcular_media(lista)
print ("media glicenica: ", media)

mediana = calcular_mediana(lista)
print ("mediana glicenica: ", mediana)