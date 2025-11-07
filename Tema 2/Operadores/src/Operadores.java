public class Operadores {





    public void operadoresAritmeticos () {
        //unarios
        int operandoUno = 5;
        //incremento
        operandoUno++; // le suma uno al valor que ya tenia
        operandoUno++;
        operandoUno++;
        operandoUno++;
        System.out.println("El valor de operando uno es " + operandoUno);
        //decremento -> le resta uno al valor que ya tenia
        operandoUno--;
        operandoUno--;
        operandoUno--;
        operandoUno--;
        System.out.println("El valor de operando uno es" + operandoUno);
        //binarios -> dos operadores: suma (+) resta (-) multi (*) div (/) modulo-resto division(%)
        operandoUno = 5;
        int operandoDos = 2;
        int suma = operandoUno + operandoDos;
        System.out.println("El resultado de la suma es" + suma);
        int resta = operandoUno - operandoDos;
        System.out.println("El resultado de la resta es" + resta);
        int multi = operandoUno * operandoDos;
        System.out.println("El resultado de la multi es" + multi);
        double division = (double) operandoUno / operandoDos;
        System.out.println("El resutlado de la division es " + division);
        int modulo = operandoUno % operandoDos;
        System.out.println("El modulo de la division es" + modulo);
        // me vale para saber si un numero es par o impar
    }
        public void operadoresAsignacion() {
            int operadorUno = 10;
            //operadorUno = operadorUno+5;
            operadorUno += 5; // en operandoUno guarda la suma de lo que valia operadorUno +5
            operadorUno += 15;
            System.out.println("El valor de operador 1 es" + operadorUno);
            }
//seran utilizados como condiciones para ejecutar una parte del codigo u otra
         public void operadorComparacion() {
             int operandoUno = 10;
             int operandoDos = 20;
             boolean resultado = operandoUno > operandoDos;
             System.out.println("El resultado de la comapracion es" + resultado);
             resultado = operandoUno < operandoDos;
             System.out.println("El resultado de la comparacion es" + resultado);
             resultado = operandoUno <= operandoDos;
             resultado = operandoUno >= operandoDos;
             resultado = operandoUno == operandoDos;
             resultado = operandoUno != operandoDos;
         }

             public void operadoresLogicos(){
                 // LOGICOS: AND, OR, NOT
                 int sueldo = 20000;
                 int edad = 45;
                 boolean carnet = true;
                 // cuando quiera cobrar menos de 30000 y tiene menos de 40 años y puede conducir
                 boolean candidatoValido = sueldo<30000 && edad<40 && carnet; //falso
                 candidatoValido = sueldo<20000 || edad<25 || carnet && sueldo>25000 && edad>60;
                                  // False         || True      || True
                                  // T && F && F -> Falso

                 System.out.println("El candidato es valido"+candidatoValido);




             }

             public void evaluarCandidato

            }





