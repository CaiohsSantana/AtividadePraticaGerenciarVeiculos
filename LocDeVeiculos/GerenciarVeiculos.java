import java.util.ArrayList;
public class GerenciarVeiculos  {
    private ArrayList<Veiculo> lista;
    
    public GerenciarVeiculos(){
        lista = new ArrayList<>();
    }
    public String exibirTodos(){
        return "";
    }
    public void novoVeiculo(String modelo,String marca,int fabricacao,double valorMercado,String placa,String TCombustivel[]){
        lista.add(new Veiculo( modelo,  marca, fabricacao, valorMercado, placa, TCombustivel));
    }
    public void apagarVeiculo(String placa){
        for (Veiculo veiculo : lista) {
            if (veiculo.getPlaca().equalsIgnoreCase(placa)) {
                lista.remove(veiculo);
                return;
            }
        }}
        public void calcularImposto(){
        System.out.println(lista);
        }
         
    }
  