package FibonacciOBJ;

public class Fibonacci_clase {
    private int numTerminos;
    
    public Fibonacci_clase() {
        //this.numTerminos = numTerm;
    }
    
    public void setNumTerminos(int numTerminos) {
        this.numTerminos = numTerminos;
    }

    public int getNumTerminos() {
        return numTerminos;
    }
    
    
    
    public int FiboValor(int pos){
        if(pos+1<=2){
            return 1;
        } else {
            return FiboValor(pos-1) + FiboValor(pos-2);
        }
    }
    
    public String FiboSerie(int lenght){
        String Serie = "";
        for (int i = 0; i < lenght; i++) {
            Serie = Serie + "-" + FiboValor(i);
        }
        return Serie;
    }
    
}
