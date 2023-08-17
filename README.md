# UniCesumar Programação 01 Atividade MAPA
Esse projeto é uma atividade MAPA referente a disciplina Programação 1 que eu realizei no curso de ADS pela UniCesumar.

## Atividade
A tecnologia e a saúde andam cada vez mais próximas, com o poder da tecnologia é possível apoiar e melhorar os mais diversos processos da medicina. Hoje através de um dispositivo conectado ao corpo é possível por exemplo controlar índices de glicemia de forma online. Tais parâmetros podem ser lidos todos através do smartphone. Fora os smartwatches que conseguem monitorar batimentos cardiácos, oxigenação do sangue, entre outras funcionalidades que salvam vidas.

Sabendo disso um laboratório quer criar um dispositivo de monitoramento de 3 tipos de exames, o de glicemia, colesterol e triglicerídeo. Todos exames devem armazenar algumas características em comum como por exemplo, nome do paciente, tipo sanguíneo e ano de nascimento. Já para cada tipo de exame é necessário características específicas como:
- Glicemia: precisa armazenar além dos dados do exame a quantidade de glicose por mg/l
- Colesterol: precisa armazenar além dos dados do exame a quantidade de LDL e HDL por mg/l e o risco do paciente (B - baixo, M - medio e A - alto)
- Triglicerídeos: precisa armazenar além dos dados do exame a quantidade de triglicerídeo por mg/l
    
Todos esses exames devem possuir três métodos, são eles:
- Classificar Resultado: Responsável por aplicar a conclusão a partir da quantidade obtida, deve olhar a quantidade e classificar como:
  - Para Glicemia:
    - Normoglicemia: Inferior a 100 mg/dL
    - Pré-diabetes: Superior ou igual a 100 mg/dL eles Inferior a 126 mg/dL
    - Diabetes estabelecido: Superior ou igual a 126 mg/dL
  - Para Colesterol HDL:
    - De 0 a 19 anos..: superior a 45 mg/dL (HDL - BOM)
    - Acima de 20 anos: superior a 40 mg/dL (HDL - BOM)
  - Para Colesterol LDL:
    - Se o paciente for risco baixo, o colesterol LDL deve estar abaixo de 100 mg/dL
    - Se o paciente for risco médio, o colesterol LDL deve estar abaixo de 70 mg/dL
    - Se o paciente for risco alto, o colesterol LDL deve estar abaixo de 50 mg/dL
      - Obs.: Como são dois parâmetros a classificação deve trazer as duas informações.
  - Para Triglicerídeos:
    - De 0 a 9 anos: Com jejum: inferior a 75 mg/dL
    - De 10 a 19 anos: Com jejum: inferior a 90 mg/dL
    - Acima de 20 anos: Com Jejum: inferior a 150 mg/dL
                               
_Obs.: Considere o campo ano de nascimento para calcular a idade, não importando o dia e mês do nascimento._
                               
- Mostrar resultado: escrever na tela o valor do exame + a classificação obtida.
- Cadastrar Exame: no cadastro de exame, deve ser lido os dados do exame, bem como a quantidade em mg/dL já examinado pelo laboratório

Lembre-se dos 4 pilares da orientação a objeto, os quais são, Abstração, Encapsulamento, Herança e Polimorfismo, e enquadre os conceitos que forem pertinentes ao problema.

Para funcionamento do programa, poderá ser criado uma classe Principal para que se crie os objetos e executem os métodos, sem ter a necessidade da criação de uma interação com usuário, os dados para os testes devem ser fictícios.
