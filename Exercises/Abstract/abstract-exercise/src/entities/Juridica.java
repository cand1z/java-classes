package entities;

public class Juridica extends Contribuinte{

    private Integer numeroDeFuncionarios;

    public Juridica() {
        super();
    }

    public Juridica(String nome, Double rendaAnual, Integer numeroDeFuncionarios) {
        super(nome, rendaAnual);
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    public Integer getNumeroDeFuncionarios() {
        return numeroDeFuncionarios;
    }

    public void setNumeroDeFuncionarios(Integer numeroDeFuncionarios) {
        this.numeroDeFuncionarios = numeroDeFuncionarios;
    }

    @Override
    public double imposto() {
        if (numeroDeFuncionarios <= 10) {
            return super.getRendaAnual() * 0.16;
        }
        return super.getRendaAnual() * 0.14;
    }
}
