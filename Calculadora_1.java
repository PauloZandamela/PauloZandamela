
import java.io.*;

public class Calculadora_1{
     public static void main(String [] args) throws IOException{

        BufferedReader x  = new BufferedReader (new InputStreamReader(System.in));
        double num1, num2, resolutado=0;
        byte op;

        System.out.print("Calculadora -  SELECIONE A OP��O: \n1-SOMA \n2-SUBTRA��O \n3-MULTIPLICA��O \n4-DIVIS�O");
        op=Byte.parseByte(x.readLine());

        System.out.print(" INTRODUZA O PRIMEIRO VALOR: ");
        num1 = Double.parseDouble(x.readLine());

        System.out.print(" INTRODUZA O SEGUNDO VALOR: "); 
        num2 = Double.parseDouble(x.readLine());

        do{
                switch (op) {
                        case 1:
                                resolutado  = num1 + num2;
                                System.out.println("RESULTADO DO CALCULO: "+resolutado);
                        break;

                        case 2:
                                resolutado  = num1 - num2;
                                System.out.println("RESULTADO DO CALCULO: "+resolutado);
                        break;

                        case 3:
                                resolutado  = num1 * num2;
                                System.out.println("RESULTADO DO CALCULO: "+resolutado);
                        break;

                        case 4:{
                                if(num2==0){
                                        System.out.println("NAO � POSS�VEL DIVIDIR UM N�MERO ZERO");
                                }
                                else{
                                        resolutado  = num1 + num2;
                                        System.out.println("RESULTADO DO CALCULO: "+resolutado);
                                }
                        }
                        break;

                        default: 
                                System.out.println("OPCAO INVALIDA...");
                        break;
                }
        }while(op>=0 || op<=4);

    }
}

