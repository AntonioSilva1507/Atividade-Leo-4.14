public class Porta {
    private boolean aberta;
    private String cor;
    private double dimensaoX;
    private double dimensaoY;
    private double dimensaoZ;

    public Porta() {
        this.aberta = false;
        this.cor = "sem cor";
        this.dimensaoX = 1.0;
        this.dimensaoY = 2.0;
        this.dimensaoZ = 0.3;
    }

    public void abre() {
        this.aberta = true;
    }

    public void fecha() {
        this.aberta = false;
    }

    public void pinta(String cor) {
        this.cor = cor;
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public static void main(String[] args) {
        Porta porta = new Porta();

        porta.abre();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.fecha();
        System.out.println("A porta está aberta? " + porta.estaAberta());

        porta.pinta("vermelho");
        System.out.println("Cor da porta: " + porta.cor);

        porta.dimensaoX = 2.0;
        porta.dimensaoY = 2.5;
        porta.dimensaoZ = 0.4;
    }
}