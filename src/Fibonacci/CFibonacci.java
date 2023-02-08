package Fibonacci;

public class CFibonacci {
    private int numTerminos;

    public CFibonacci(int numTerm) {
        this.numTerminos = numTerm;
    }
    
    
    public int getNumTerminos() {
        return numTerminos;
    }

    public void setNumTerminos(int numTerminos) {
        this.numTerminos = numTerminos;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        FiboWND Main = new FiboWND();
        Main.setVisible(true);
    }
    
    
    public static int calcularFibo(int pos){
        if(pos+1<=2){
            return 1;
        } else {
            return calcularFibo(pos-1) + calcularFibo(pos-2);
        }
    }
    
    public static String FibotoString(int lenght){
        String Serie = "";
        for (int i = 0; i < lenght; i++) {
            Serie = Serie + "-" + calcularFibo(i);
        }
        return Serie;
    }
}
