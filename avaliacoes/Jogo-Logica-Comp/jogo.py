def caso_normal():
    vidas = 2

    prop1 = False
    prop2 = False
    prop3 = False

    while True:
        print("\n" * 2)
        print("""
============================================================
CASO 1 - ROUBO DA PINTURA
              
Uma pintura valiosa desapareceu do museu durante a madrugada.

Suspeitos:
- Ana
- Bruno
- Carla 
============================================================ """)
        print("PROPOSIÇÕES REVELADAS")
        print("============================================================")

        if prop1:
            print("""
    PROPOSIÇÃO 1
    Se Bruno roubou a pintura,
    então ele apareceu nas câmeras.
    """)

        if prop2:
            print("""
    PROPOSIÇÃO 2
    Bruno NÃO apareceu nas câmeras.
    """)

        if prop3:
            print("""
    PROPOSIÇÃO 3
    Ou Bruno roubou a pintura,
    ou Carla roubou a pintura.
    """)

        print("----------------------------------------")

        if not prop1:
            print("1 - Revelar Proposição 1")

        if not prop2:
            print("2 - Revelar Proposição 2")

        if not prop3:
            print("3 - Revelar Proposição 3")

        if prop1 and prop2 and prop3:
            print("4 - Responder")
            print("5 - Dica")

        opcao = input("\nEscolha: ")

        match opcao:
            case "1":
                if prop1:
                    print("Essa proposição já foi revelada.")
                else:
                    prop1 = True

            case "2":
                if prop2:
                    print("Essa proposição já foi revelada.")
                else:
                    prop2 = True

            case "3":
                if prop3:
                    print("Essa proposição já foi revelada.")
                else:
                    prop3 = True

            case "4":
                if prop1 and prop2 and prop3:
                    print("\nQuem roubou a pintura?\n")

                    print("A) Ana")
                    print("B) Bruno")
                    print("C) Carla")
                    print("D) Não é possível concluir")

                    resposta = input("\nResposta: ").upper()

                    if resposta == "C":
                        print("\nParabéns!")
                        print("Você resolveu o caso!")

                        input("\nPressione ENTER para voltar ao menu...")
                        return
                    else:
                        vidas -= 1

                        if vidas > 0:
                            print("\nResposta incorreta!")
                            print("Vidas restantes:", vidas)
                            input("\nPressione ENTER para continuar...")
                        else:
                            print("\nGAME OVER")

                            input("\nPressione ENTER para voltar ao menu...")
                            return
                else:
                    print("\nRevele todas as proposições primeiro.")
                    input("\nPressione ENTER para continuar...")

            case "5":
                if prop1 and prop2 and prop3:
                    print("""
============================================================
    DICA:
                                      
    Primeiro elimine um suspeito
    utilizando Modus Tollens.

    Depois utilize o
    Silogismo Disjuntivo
    para descobrir o culpado.

============================================================
    """)

                    input("Pressione ENTER para continuar...")

                else:
                    print("\nA dica só é liberada após revelar todas as proposições.")
                    input("\nPressione ENTER para continuar...")

            case _:
                print("\nOpção inválida.")
                input("\nPressione ENTER para continuar...")

def caso_dificil():
    vidas = 2

    prop1 = False
    prop2 = False
    prop3 = False
    prop4 = False
    prop5 = False

    while True:
        print("\n" * 2)
        print("""
============================================================
CASO 2 - ASSASSINATO NA MANSÃO

Um empresário foi encontrado morto em sua mansão.

Após a investigação, apenas três suspeitos permaneceram:

- Arthur
- Bianca
- Carlos
============================================================ """)

        print("PROPOSIÇÕES REVELADAS")
        print("============================================================")

        if prop1:
            print("""
PROPOSIÇÃO 1
Se Arthur cometeu o crime,
então sua digital está na arma.
""")

        if prop2:
            print("""
PROPOSIÇÃO 2
A perícia concluiu que
não há digitais de Arthur na arma.
""")

        if prop3:
            print("""
PROPOSIÇÃO 3
Ou Arthur cometeu o crime,
ou Bianca cometeu o crime.
""")

        if prop4:
            print("""
PROPOSIÇÃO 4
Se Bianca cometeu o crime,
então Carlos ajudou a esconder as provas.
""")

        if prop5:
            print("""
PROPOSIÇÃO 5
Carlos foi visto escondendo provas.
""")

        print("----------------------------------------")
        if not prop1:
            print("1 - Revelar Proposição 1")

        if not prop2:
            print("2 - Revelar Proposição 2")

        if not prop3:
            print("3 - Revelar Proposição 3")

        if not prop4:
            print("4 - Revelar Proposição 4")

        if not prop5:
            print("5 - Revelar Proposição 5")

        if prop1 and prop2 and prop3 and prop4 and prop5:
            print("6 - Responder")
            print("7 - Dica")

        opcao = input("\nEscolha: ")

        match opcao:
            case "1":
                if prop1:
                    print("Essa proposição já foi revelada.")
                else:
                    prop1 = True

            case "2":
                if prop2:
                    print("Essa proposição já foi revelada.")
                else:
                    prop2 = True

            case "3":
                if prop3:
                    print("Essa proposição já foi revelada.")
                else:
                    prop3 = True

            case "4":
                if prop4:
                    print("Essa proposição já foi revelada.")
                else:
                    prop4 = True

            case "5":
                if prop5:
                    print("Essa proposição já foi revelada.")
                else:
                    prop5 = True

            case "6":
                if prop1 and prop2 and prop3 and prop4 and prop5:
                    print("\nQuem cometeu o assassinato?\n")

                    print("A) Arthur")
                    print("B) Bianca")
                    print("C) Carlos")
                    print("D) Não é possível concluir")

                    resposta = input("\nResposta: ").upper()

                    if resposta == "B":
                        print("\nParabéns!")
                        print("Você resolveu o caso!")

                        input("\nPressione ENTER para voltar ao menu...")
                        return

                    else:
                        vidas -= 1

                        if vidas > 0:
                            print("\nResposta incorreta!")
                            print("Vidas restantes:", vidas)
                            input("\nPressione ENTER para continuar...")

                        else:
                            print("\nGAME OVER")
                            input("\nPressione ENTER para voltar ao menu...")
                            return

                else:
                    print("\nRevele todas as proposições primeiro.")
                    input("\nPressione ENTER para continuar...")

            case "7":
                if prop1 and prop2 and prop3 and prop4 and prop5:
                    print("""
============================================================
DICA:

Primeiro utilize Modus Tollens para eliminar
um dos suspeitos.

Em seguida, utilize o Silogismo Disjuntivo
para descobrir quem obrigatoriamente cometeu
o crime.

A última proposição apenas confirma que
a conclusão obtida é coerente com as provas.
============================================================
""")

                    input("Pressione ENTER para continuar...")
                else:
                    print("\nA dica só é liberada após revelar todas as proposições.")
                    input("\nPressione ENTER para continuar...")

            case _:
                print("\nOpção inválida.")
                input("\nPressione ENTER para continuar...")

def menu():
    while True:
        print("""
============================================================
TRABALHO DE LÓGICA PARA COMPUTAÇÃO
              
Nesse jogo, você deverá resolver casos utilizando
conceitos de lógica proposicional, como Proposições,
Condicionais, Modus Ponens, Modus Tollens e
Silogismo Disjuntivo.

Em cada caso, revele todas as proposições para reunir
as pistas. Depois de analisá-las, escolha quem é o
culpado. Depois de revelar todas as proposições, é possível
utilizar a opção de dica para receber uma orientação sobre
o raciocínio lógico da questão.
              
O jogo conta com duas dificuldades: normal e difícil. Ambos
os modos possuem duas vidas, porém o modo difícil possui
mais alternativas e um contexto mais complexo.
============================================================
""")

        print("1 - Iniciar Jogo")
        print("0 - Sair")

        inicio = input("Escolha uma opção: ")

        if inicio == "1":
            break

        elif inicio == "0":
            print("\nFinalizando...")
            return

        else:
            print("\nOpção inválida!\n")

    while True:
        print("\n========================================")
        print("        ESCOLHA A DIFICULDADE")
        print("========================================")
        print("1 - Modo Normal")
        print("2 - Modo Difícil")
        print("0 - Voltar")

        opcao = input("Escolha uma opção: ")

        match opcao:
            case "1":
                caso_normal()
                input("\nPressione ENTER para voltar ao menu...")

            case "2":
                caso_dificil()
                input("\nPressione ENTER para voltar ao menu...")

            case "0":
                break
            
            case _:
                print("\nOpção inválida!\n")

menu()