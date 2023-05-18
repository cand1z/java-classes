package entities;

public class Fisica extends Contribuinte {

    private Double gastosSaude;

    public Fisica() {
        super();
    }

    public Fisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if(super.getRendaAnual() < 20000.0){
            if (gastosSaude > 0.0) {
                return (super.getRendaAnual() * 0.15) - (gastosSaude * 0.50);
            }
            return super.getRendaAnual() * 0.15;
        }
        if (gastosSaude > 0.0) {
            return (super.getRendaAnual() * 0.25) - (gastosSaude * 0.50);
        }
        return super.getRendaAnual() * 0.25;
    }
}
