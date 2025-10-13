
package Tema5.EJ01;


public class Subsidio {
    private double montoPedido;
    private String motivo;
    private boolean otorgado;
    
    public Subsidio(double monto, String motivo){
        setMontoPedido(monto);
        setMotivo(motivo);
        setOtorgado(false);
    }

    public double getMontoPedido() {
        return montoPedido;
    }

    public void setMontoPedido(double montoPedido) {
        this.montoPedido = montoPedido;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean getOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }
}
