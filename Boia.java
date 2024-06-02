class Boia {
    private double latitude;
    private double longitude;
    private int hashCode;
    private double salinidade;
    private double temperatura;

    public Boia(String coordenadas) {
        String[] partes = coordenadas.split(" ");
        this.latitude = Double.parseDouble(partes[0]);
        this.longitude = Double.parseDouble(partes[1]);
        this.hashCode = gerarHashCode();
    }

    private int gerarHashCode() {
        // A lógica de geração do hash code baseado na especificação
        String latStr = String.format("%.2f", Math.abs(latitude)).replace(".", "");
        String lonStr = String.format("%.2f", Math.abs(longitude)).replace(".", "");
        return Integer.parseInt(latStr.substring(1, 2) + latStr.substring(3, 4) + lonStr.substring(1, 2) + lonStr.substring(3, 4));
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public int getHashCode() {
        return hashCode;
    }

    public String getCoordenadas() {
        return String.format("Lat: %.2f Lon: %.2f", latitude, longitude);
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
        return String.format("Boia [coordenadas=%s, hashCode=%d, salinidade=%.2f, temperatura=%.2f]",
                getCoordenadas(), hashCode, salinidade, temperatura);
    }
}