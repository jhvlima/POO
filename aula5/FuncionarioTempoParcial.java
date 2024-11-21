
public class FuncionarioTempoParcial extends Funcionario{

    private int HorasSemanais;

    public void setNumeroHorasSemanais(int horas)
    {
        this.HorasSemanais = horas;
    }

    public FuncionarioTempoParcial(String string, float f) {
        this.setNome(string);
        this.setSalario(f);
    }

}
