package executavel;

import java.util.Scanner;

public class Aplicacao {
    static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        char continuar;
        
        do {
            int quantidadeHomens = 0;
            double somaAlturaHomens = 0;
            int quantidadeMulheres = 0;
            double somaPesoMulheres = 0;
            
            String nomeHomemMaisPesado = null;
            double pesoHomemMaisPesado = -1;
            String nomeMulherMaisAlta = null;
            double alturaMulherMaisAlta = -1;
            
            char sexo;
            
            do {
                System.out.println("Digite os dados da pessoa:");
                System.out.print("Nome: ");
                String nome = scanner.next();
                
                sexo = obterSexo();
                double altura = obterAltura();
                double peso = obterPeso();
                
                if (sexo == 'M' || sexo == 'm') {
                    quantidadeHomens++;
                    somaAlturaHomens += altura;
                    if (peso > pesoHomemMaisPesado) {
                        nomeHomemMaisPesado = nome;
                        pesoHomemMaisPesado = peso;
                    }
                } else if (sexo == 'F' || sexo == 'f') {
                    quantidadeMulheres++;
                    somaPesoMulheres += peso;
                    if (altura > alturaMulherMaisAlta) {
                        nomeMulherMaisAlta = nome;
                        alturaMulherMaisAlta = altura;
                    }
                } else {
                    System.out.println("Sexo inválido, por favor digite M ou F.");
                }
                
                System.out.print("Deseja cadastrar outra pessoa? (S/N): ");
                continuar = Character.toUpperCase(scanner.next().charAt(0));
            } while (continuar == 'S');
            
            if (quantidadeHomens > 0) {
                double mediaAlturaHomens = somaAlturaHomens / quantidadeHomens;
                System.out.println("Média das alturas dos homens: " + mediaAlturaHomens + " metros");
                System.out.println("Homem mais pesado: " + nomeHomemMaisPesado);
            } else {
                System.out.println("Nenhum homem cadastrado.");
            }
            
            if (quantidadeMulheres > 0) {
                double mediaPesoMulheres = somaPesoMulheres / quantidadeMulheres;
                System.out.println("Média dos pesos das mulheres: " + mediaPesoMulheres + " kg");
                System.out.println("Mulher mais alta: " + nomeMulherMaisAlta);
            } else {
                System.out.println("Nenhuma mulher cadastrada.");
            }
            
            System.out.print("Deseja analisar outro grupo de pessoas? (S/N): ");
            continuar = Character.toUpperCase(scanner.next().charAt(0));
        } while (continuar == 'S');
        
        scanner.close();
    }
    
    static char obterSexo() {
        char sexo;
        do {
            System.out.print("Sexo (M/F): ");
            sexo = Character.toUpperCase(scanner.next().charAt(0));
        } while (sexo != 'M' && sexo != 'F');
        return sexo;
    }
    
    static double obterAltura() {
        System.out.print("Altura (em metros): ");
        return scanner.nextDouble();
    }
    
    static double obterPeso() {
        System.out.print("Peso (em kg): ");
        return scanner.nextDouble();
    }
}

    		
    		
    		
    		
    		
 