programa {
    cadeia nome
    inteiro i
		cadeia rota[] = { "ÔNIBUS 01", "ÔNIBUS 02" , "ÔNIBUS 03", "ÔNIBUS 04", "ÔNIBUS 05" }
    cadeia horarios[][] = {
        {"07:30", "09:30", "11:30", "13:30", "15:30"},
        {"09:30", "11:30", "13:30", "15:30", "17:30"},
        {"08:00", "10:00", "12:00", "14:00", "16:00"},
        {"08:30", "10:30", "12:30", "14:30", "16:30"},
        {"06:30", "08:00", "10:30", "12:30", "15:30"}
    }
  funcao inicio() {
    escreva("Digite seu nome:")
    leia(nome)
    inteiro opcao
    escreva(nome,", você deseja ver o hoário de qual Ônibus ? ")
    escreva("\n1) ÔNIBUS 01")
    escreva("\n2) ÔNIBUS 02")
    escreva("\n3) ÔNIBUS 03")
    escreva("\n4) ÔNIBUS 04")
    escreva("\n5) ÔNIBUS 05")
    escreva("\nDigite sua escolha:")
    leia(opcao)

    escolha(opcao){
      caso 1:
      escreva (rota[0], "\n")
        para(i = 0; i < 5; i++) {
            escreva(horarios[0][i], "\n")
      }
      pare

      caso 2:
      escreva (rota[1], "\n")
        para(i = 0; i < 5; i++) {
            escreva(horarios[1][i], "\n")
      }
      pare

      caso 3:
      escreva (rota[2], "\n")
        para(i = 0; i < 5; i++) {
            escreva(horarios[2][i], "\n")
      }
      pare

      caso 4:
      escreva (rota[3], "\n")
        para(i = 0; i < 5; i++) {
            escreva(horarios[3][i], "\n")
      }
      pare

      caso 5:
      escreva (rota[4], "\n")
        para(i = 0; i < 5; i++) {
            escreva(horarios[4][i], "\n")
      }
      pare
      }
    }      
  }
