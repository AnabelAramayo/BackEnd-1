public class Figura {
    private String tipoFigura;
    private Double tamanho;

    public Figura(String tipoFigura, Double tamanho) {
        this.tipoFigura = tipoFigura;
        this.tamanho = tamanho;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public Double calcularArea () {
        Double area;
        if (getTipoFigura() == "circulo") {
            area = (Math.PI * (getTamanho() * getTamanho()));
        } else {
            area = getTamanho() * getTamanho();
        }
        return area;
    };
}
