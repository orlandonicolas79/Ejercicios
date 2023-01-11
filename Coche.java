class Coche {
    private int numPuertas;

    public Coche(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public void incrementarNumPuertas() {
        this.numPuertas++;
    }

    public int getNumPuertas() {
        return this.numPuertas;
    }
    
    public static void main(String[] args) {
      Coche miCoche = new Coche(4);
      miCoche.incrementarNumPuertas();
      int numPuertas = miCoche.getNumPuertas();
      System.out.println("Mi coche tiene " + numPuertas + " puertas.");
	}
}

