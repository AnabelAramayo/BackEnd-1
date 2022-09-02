public class SerieProxy implements ISerie {
    private int cantVisitas = 0;
    private Serie serie;

    public SerieProxy(int cantVisitas, Serie serie) {
        this.cantVisitas = cantVisitas;
        this.serie = serie;
    }

    public int getCantVisitas() {
        return cantVisitas;
    }

    public void setCantVisitas(int cantVisitas) {
        this.cantVisitas = cantVisitas;
    }

    @Override
    public String getSerie() throws SerieNoHabilitadaException {
        if(cantVisitas > 5){
            throw new SerieNoHabilitadaException("Has superado la cantidad de reproducciones. No más de 5");
        }else{
            cantVisitas ++;
            return serie.getSerie();
        }

    }
}
