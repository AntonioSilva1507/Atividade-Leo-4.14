public class Casa {
    private String cor;
    private boolean porta1Aberta;
    private boolean porta2Aberta;
    private boolean porta3Aberta;

    public Casa(String cor) {
        this.cor = cor;
    }

    public void pinta(String novaCor) {
        this.cor = novaCor;
    }

    public void abrePorta1() {
        this.porta1Aberta = true;
    }

    public void abrePorta2() {
        this.porta2Aberta = true;
    }

    public void abrePorta3() {
        this.porta3Aberta = true;
    }

    public void fechaPorta1() {
        this.porta1Aberta = false;
    }

    public void fechaPorta2() {
        this.porta2Aberta = false;
    }

    public void fechaPorta3() {
        this.porta3Aberta = false;
    }

    public int quantasPortasEstaoAbertas() {
        int numPortasAbertas = 0;
        if (this.porta1Aberta) {
            numPortasAbertas++;
        }
        if (this.porta2Aberta) {
            numPortasAbertas++;
        }
        if (this.porta3Aberta) {
            numPortasAbertas++;
        }
        return numPortasAbertas;
    }

    public static void main(String[] args) {
        Casa minhaCasa = new Casa("Azul");

        minhaCasa.pinta("Verde");
        minhaCasa.abrePorta1();
        minhaCasa.abrePorta2();
        minhaCasa.fechaPorta3();

        int numPortasAbertas = minhaCasa.quantasPortasEstaoAbertas();
        System.out.println("Número de portas abertas: " + numPortasAbertas);
    }
}

    

