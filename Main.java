public class Main {
    public static void main(String[] args) {
        float Suma1;
        Suma1 = suma(4, 5, 6);
        System.out.println(Suma1);

        coche miCoche = new coche();
        miCoche.incremento_puertas();
        System.out.println(miCoche.numero_de_puertas);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;


    }
}
class coche{
        public int numero_de_puertas= 4;
        public void incremento_puertas(){
            this.numero_de_puertas++;
    }

}
