package co.com.choucair.certification.latam.model;

public class DataConsultaBD {
    private String tipovuelo;
    private String origen;
    private String destino;
    private String fechaida;
    private String fechavuelta;
    private String clase;

    public String getTipovuelo() {return tipovuelo;}
    public void setTipovuelo(String tipovuelo) {this.tipovuelo = tipovuelo;}

    public String getOrigen() {return origen;}
    public void setOrigen(String origen) {this.origen = origen;}

    public String getDestino() {return destino;}
    public void setDestino(String destino) {this.destino = destino;}

    public String getFechaida() {return fechaida;}
    public void setFechaida(String fechaida) {this.fechaida = fechaida;}

    public String getFechavuelta() {return fechavuelta;}
    public void setFechavuelta(String fechavuelta) {this.fechavuelta = fechavuelta;}

    public String getClase() {return clase;}
    public void setClase(String clase) {this.clase = clase;}
}
