import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Vetor v = new Vetor(4);
        Vetor v2 = new Vetor(5);

        System.out.println("Preenchendo o vetor 1:");
        boolean querFicar = true;
        while(querFicar) {
            System.out.print("Digite um inteiro (\"exit\" para sair): ");
            String str = input.next();
            if(str.equals("exit")) {
                querFicar = false;
            }
            else {
                v.add(Integer.parseInt(str)); 
            }
        }

        System.out.println("Preenchendo o vetor 2:");
        querFicar = true;
        while(querFicar) {
            System.out.print("Digite um inteiro (\"exit\" para sair): ");
            String str = input.next();
            if(str.equals("exit")) {
                querFicar = false;
            }
            else { 
                v2.add(Integer.parseInt(str));
            }
        }

        if(v.equals(v2)) {
            System.out.println("OS VETORES SÃO IGUAIS!!!");
        }
        else {
            System.out.println("OS VETORES SÃO DIFERENTES!!!");
        }

        System.out.println("vetor 1: " + v); // chamar o toString()
        System.out.println("Size: " + v.size());
        System.out.println("Capacidade: " + v.capacidade());

        System.out.println("vetor 2: " + v2); // chamar o toString()
        System.out.println("Size: " + v2.size());
        System.out.println("Capacidade: " + v2.capacidade());
    }
}
