public class Boia {
    private String coordenadas;
    private int hashCode;
    private double salinidade;
    private double temperatura;

    public Boia(String coordenadas) {
        this.coordenadas = coordenadas;
        this.hashCode = gerarHashCode(coordenadas);
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public int getHashCode() {
        return hashCode;
    }

    public double getSalinidade() {
        return salinidade;
    }

    public void setSalinidade(double salinidade) {
        this.salinidade = salinidade;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Boia [coordenadas=" + coordenadas + ", hashCode=" + hashCode + ", salinidade=" + salinidade + ", temperatura=" + temperatura + "]";
    }

    private int gerarHashCode(String coordenadas) {
        coordenadas = coordenadas.replace(" ", "");
        String hashStr = "" + coordenadas.charAt(1) + coordenadas.charAt(2) + coordenadas.charAt(7) + coordenadas.charAt(8);
        return Integer.parseInt(hashStr);
    }
}
